package com.demo.springbootdemo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
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

	@GetMapping("/books/{id}")
	public Object getOne(@PathVariable long id) {
		System.out.println(" --- id: " + id);

		Map<String, Object> map = new HashMap<>();
		map.put("name", "hello");
		map.put("age", 18);
		return map;
	}
	
	@PostMapping("/books")
	public Object post (@RequestParam String name,
			            @RequestParam String author,
			            @RequestParam String isbn) {
		Map<String, Object> book = new HashMap<String, Object>();
		book.put("name", name);
		book.put("author", author);
		book.put("isbn", isbn);
		
		return book;
	}
}
