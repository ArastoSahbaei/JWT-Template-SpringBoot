package se.robasto.service;

import se.robasto.entity.User;
import se.robasto.model.UserModel;

import java.util.List;

public interface UserServiceInterface {
    List<UserModel> findAllUsers();
    UserModel FindUserById(Long id);
    User FindUserByUserName(String username);
    UserModel createNewUser(UserModel userModel);
}
