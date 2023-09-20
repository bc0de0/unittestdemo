package com.testingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingdemo.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
