package com.trading.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


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
