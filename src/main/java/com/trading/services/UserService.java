package com.trading.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trading.entities.User;

public interface UserService {

	public User registerUser(User user);

	public User loginUser(String username, String password);

	@Query("SELECT u FROM User u WHERE u.email = :email")
	public User findEmail(@Param("email") String email); //to be used when to search if a user already exists when registering 

}
