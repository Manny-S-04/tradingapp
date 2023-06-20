package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trading.entities.User;
import com.trading.entities.*;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
	public User login(@Param("username") String username, @Param("password") String password);

	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User findUsername(@Param("username") String username);

}
