package com.trading.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.trading.entities.User;
import com.trading.repositories.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User registerUser(User user) {

		return userRepository.save(user);

	}

	@Override
	public User loginUser(String username, String password) {
		

		return userRepository.login(username, password);
		
	}

	@Override
	public User findEmail(String email) {
		
		return userRepository.findEmail(email);
	}
	
	
	
	

}
