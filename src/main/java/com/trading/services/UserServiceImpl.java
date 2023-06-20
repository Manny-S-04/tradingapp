package com.trading.services;

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
<<<<<<< HEAD
		
=======

>>>>>>> d9a4afafb4804bcc369f95eb756b529bb6ddef00
		return userRepository.login(username, password);
	}

	@Override
	public User userExist(String username) {

		return userRepository.findUsername(username);
	}

}
