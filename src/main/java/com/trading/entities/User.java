package com.trading.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name="user")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@OneToMany(mappedBy = "userId")
	private List<Order> orders;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	public User() {}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getUserid() {
		return userId;
	}

	public void setUserid(int userid) {
		this.userId = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
