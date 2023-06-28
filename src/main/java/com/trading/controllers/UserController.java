package com.trading.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trading.entities.User;
import com.trading.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String empty() {
		return "home";
	}

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

		User userExists = userService.userExist(username);

		if (userExists == null) {

			User registeredUser = userService.registerUser(new User(username, password));

			if (registeredUser != null) {
				return "login";
			} else {
				return "error";
			}
		} else {
			return "registerfail";
		}

	}

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session) {

		User authenticatedUser = userService.loginUser(username, password);

		if (authenticatedUser != null) {
			session.setAttribute("username", authenticatedUser.getUsername());
			session.setAttribute("password", authenticatedUser.getPassword());
			// session.setAttribute("username", authenticatedUser. GETTER GOES HERE

			return "redirect:/userdetails";
		} else {
			return "login";
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
