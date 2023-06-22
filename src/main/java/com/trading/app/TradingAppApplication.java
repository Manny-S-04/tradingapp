package com.trading.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.trading.entities")

@EnableJpaRepositories(basePackages = "com.trading.repositories")
@ComponentScan({"com.trading.controllers", "com.trading.services", "com.trading.repositories"})
public class TradingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingAppApplication.class, args);
		

	}

}
