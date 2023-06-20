package com.trading.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trading.entities.User;
import com.trading.services.*;

import jakarta.servlet.http.HttpSession;

public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String home() {

		return "home";
	}

	@GetMapping("/register")
	public String showRegisterform() {

		return "register";

	}

	@PostMapping("/register")
	public String register(@RequestParam("username") String username, @RequestParam("password") String password) {

		User userExists = userService.findEmail(username);

		if (userExists == null) {

			User registeredUser = userService.registerUser(new User(username, password));

			if (registeredUser != null) {
				return "login";
			} else {
				return "error";
			}
		}else {
			return "registerfail";
		}
		
		
		
	}

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, Model model) {
		
		User authenticatedUser = userService.loginUser(username, password);

		if (authenticatedUser != null) {
			session.setAttribute("loggedinuser", authenticatedUser);
			session.setAttribute("username", authenticatedUser.

			return "redirect:/userdetails";
		} else {
			return "greeting";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();

		return "redirect:/login";
	}

	@GetMapping("/userdetails")
	public String userDetails(HttpSession session) {

		return "userdetails";

	}

}
