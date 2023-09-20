package com.testingdemo.service;

import java.util.List;

import com.testingdemo.entity.User;

public interface UserService {
	
	public List<User> findAllUsers();
	public User findById(Long id);
	public User createUser(User user);

}
