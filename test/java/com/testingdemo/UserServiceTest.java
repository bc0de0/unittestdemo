package com.testingdemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.testingdemo.entity.User;
import com.testingdemo.repository.UserRepo;
import com.testingdemo.service.UserServiceImpl;

@SpringBootTest
public class UserServiceTest {
	
	@Mock
	private UserRepo repository;
	
	@InjectMocks
	private UserServiceImpl service;
	
	@Test
	public void testFindAllUsers() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1L, "abc", "a@a.com"));
		userList.add(new User(2L, "def", "b@a.com"));
		
		when(repository.findAll()).thenReturn(userList);
		
		List<User> finalList = new ArrayList<User>();
		finalList = service.findAllUsers();
		
		assertEquals(2, finalList.size());
	}
}
