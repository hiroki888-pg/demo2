package com.example.demo2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.data.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {

}
