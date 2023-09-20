package com.testingdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.testingdemo.entity.User;
import com.testingdemo.repository.UserRepo;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo repository;
	
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	@Override
	public User createUser(User user) {
		return repository.save(user);
	}

}
