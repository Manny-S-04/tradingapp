package com.trading.services;


import com.trading.entities.User;

public interface UserService {

public User registerUser(User user);
	
	public User loginUser(String username, String password);

}
