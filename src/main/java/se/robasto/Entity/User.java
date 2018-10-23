package se.robasto.Entity;

import se.robasto.Model.UserModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "role")
    private String role;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(UserModel userModel) {
        this.id = userModel.getId();
        this.username = userModel.getUsername();
        this.role = userModel.getRole();
        this.email = userModel.getEmail();
        this.password = userModel.getPassword();
    }

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
}

