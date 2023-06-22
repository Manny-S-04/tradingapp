package com.trading.services;

import com.trading.entities.User;
import org.springframework.data.repository.query.Param;

public interface UserService {

	public User registerUser(User user);

	public User loginUser(String username, String password);

	public User userExist(@Param("username") String username); //to be used when to search if a user already exists when registering 

}
