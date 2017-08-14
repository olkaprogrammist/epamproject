package beans;

import database.entities.UserEntity;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Locale;

/**
 * Created by Olga on 14.08.2017.
 */
public class RegistrationBean {

    private String login;
    private String role;
    private String password;

    public RegistrationBean() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole(){return role;}

    public void setRole(String role){this.role = role;}


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserEntity toEntity() {
        UserEntity entity = new UserEntity();
        entity.setLogin(login);
        entity.setPassword(password);
        entity.setRole(role);
        return entity;
    }
}
