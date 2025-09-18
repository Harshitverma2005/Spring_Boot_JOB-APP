package com.example.spring_boot_rest_jobapp.service;

import com.example.spring_boot_rest_jobapp.model.UserPrincipal;
import com.example.spring_boot_rest_jobapp.model.Users;
import com.example.spring_boot_rest_jobapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServices implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = repo.findByusername(username);

        if (users == null)
        {
            System.out.println("r r r r r r r r r r r r rr r  r r");
            throw new UsernameNotFoundException("404 d d d d d dd d d d d d d  dfound");
        }

        return new UserPrincipal(users);


    }
}
