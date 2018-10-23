package se.robasto.Service;

import se.robasto.Entity.User;
import se.robasto.Model.UserModel;

import java.util.List;

public interface UserServiceInterface {
    List<UserModel> findAllUsers();
    UserModel FindUserById(Long id);
    User FindUserByUserName(String username);
    UserModel createNewUser(UserModel userModel);
}
