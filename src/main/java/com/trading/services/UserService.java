package com.trading.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trading.entities.User;

public interface UserService {

	public User registerUser(User user);

	public User loginUser(String username, String password);

	public User userExist(@Param("username") String username); //to be used when to search if a user already exists when registering 

}
