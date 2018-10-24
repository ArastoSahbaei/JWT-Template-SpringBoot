package se.robasto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import se.robasto.entity.User;
import se.robasto.model.UserModel;
import se.robasto.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface, UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createNewUser(UserModel userModel) {
        User user = new User(userModel);
        return new UserModel(userRepository.save(user));
    }

    public List<UserModel> findAllUsers() {
        List<User> ListWithAllUsers = userRepository.findAll();
        return convertUserListToUserModelList(ListWithAllUsers);
    }

    public UserModel FindUserById(Long id) {
        User user = userRepository.getOne(id);
        return new UserModel(user);
    }

    public User FindUserByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    private List<UserModel> convertUserListToUserModelList(List<User> userList) {
        List<UserModel> userModelList = new ArrayList<>();
        for (User user : userList) {
            userModelList.add(new UserModel(user));
        }
        return userModelList;
    }

    //laddar ifrån user nu, men ska egentligen hämta ifrån model(?)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = FindUserByUserName(username);

        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        if (user != null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
            builder.roles(user.getRole());
        } else {
            throw new UsernameNotFoundException("User not found.");
        }

        return builder.build();
    }

}
