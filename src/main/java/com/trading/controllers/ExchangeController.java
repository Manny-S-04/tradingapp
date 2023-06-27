package com.trading.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExchangeController {
	
	
	
	
	
	@GetMapping("/exchange1")
	public String exchange() {

		return "exchange1";
	}


}
