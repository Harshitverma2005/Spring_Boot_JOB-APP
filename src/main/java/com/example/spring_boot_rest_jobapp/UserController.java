package com.example.spring_boot_rest_jobapp;


import com.example.spring_boot_rest_jobapp.model.Users;
import com.example.spring_boot_rest_jobapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users users)
    {
        return service.save(users);
    }

    @PutMapping("/register")
    public Users update(@RequestBody Users users)
    {
        return service.save(users);
    }
}
