package se.robasto.model;

import se.robasto.entity.User;

import java.io.Serializable;

public class UserModel implements Serializable {

    private Long id;
    private String username;
    private String role;
    private String email;
    private String password;

    public UserModel(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.role = user.getRole();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

   /* public UserModel(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }*/

    public UserModel() {}

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

