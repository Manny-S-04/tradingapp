package com.trading.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trading.entities.User;
import com.trading.repositories.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;

	
	@Override
	public User registerUser(User user) {
		
		return userRepository.save(user);
	}
	

	@Override
	public User loginUser(String username, String password) {
		
		return userRepository.loginProcess(username, password);
	}

}
