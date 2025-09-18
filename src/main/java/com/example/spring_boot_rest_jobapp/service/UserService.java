package com.example.spring_boot_rest_jobapp.service;


import com.example.spring_boot_rest_jobapp.model.Users;

import com.example.spring_boot_rest_jobapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public Users save(Users users)
    {
        users.setPassword(encoder.encode(users.getPassword()));
        return repo.save(users);
    }



}
