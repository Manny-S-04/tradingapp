package com.trading.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.trading.services.ExchangeService;
import com.trading.services.UserService;


@Controller
public class ExchangeController {
	
	
	
	
	
	@GetMapping("/exchange1")
	public String exchange() {

		return "exchange1";
	}


}
