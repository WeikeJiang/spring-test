package com.demo.springbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class HelloControler {

	@RequestMapping("/say")
    public String hello() {
    	return "Hello spring boot!";
    }
	
	@GetMapping("/books")
	public String getAll() {
		return "books";
	}
}
