package com.example.spring_boot_rest_jobapp.repo;


import com.example.spring_boot_rest_jobapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByusername(String username );
}
