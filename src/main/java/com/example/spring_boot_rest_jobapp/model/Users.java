package com.example.spring_boot_rest_jobapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Users {

    @Id
    private int id;
    private String username ;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUser_name(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Users() {
    }
}
