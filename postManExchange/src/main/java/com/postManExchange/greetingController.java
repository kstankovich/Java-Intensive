package com.postManExchange;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {
	
	private static final String template = "Welcome, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public greetingModel greeting(@RequestParam(value="name", defaultValue="User")String name) {
		
		return new greetingModel(counter.incrementAndGet(), String.format(template, name));
		
	}
	
	

}
