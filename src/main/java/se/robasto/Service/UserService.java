package se.robasto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.robasto.Entity.User;
import se.robasto.Model.UserModel;
import se.robasto.Repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {

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

}
