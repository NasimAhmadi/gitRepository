package com.example.demospringboot.repository;

import com.example.demospringboot.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}