package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name="user")
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	
}
