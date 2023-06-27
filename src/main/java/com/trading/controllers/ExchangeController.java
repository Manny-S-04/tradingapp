package com.trading.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.trading.services.ExchangeService;
import com.trading.services.UserService;


@Controller
public class ExchangeController {
	
	
	
	
	
	@GetMapping("/lse")
	public String exchange1() {

		return "lse";
	}
	
	@GetMapping("/nyse")
	public String exchange2() {

		return "nyse";
	}
	
	@GetMapping("/tse")
	public String exchange3() {

		return "tse";
	}




}
