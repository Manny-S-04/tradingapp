package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name="user")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	
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
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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
