package com.postManExchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class PostManExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostManExchangeApplication.class, args);
	}

}
