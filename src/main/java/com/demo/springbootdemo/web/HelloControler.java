package com.demo.springbootdemo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloControler {

	@RequestMapping("/say")
    public String hello() {
    	return "Hello spring boot!";
    }
	
	@GetMapping("/books")
	public Object getAll() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "hello");
		map.put("age", 18);

		return map;
	}
}
