package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample123 {
	@RequestMapping(value="/test")
	String add() {
		return "bhavani";
	}
	@RequestMapping(value="/add/{a}/{b}")
	int add(@PathVariable int a,@PathVariable int b) {
		int c= a+b;
		return c;
	}
	@RequestMapping(value="/add/{a}/{b}/{c}")
	int add(@PathVariable int a,@PathVariable int b,@PathVariable int c) {
		int d=a+b+c;
		return d;
		
	}
	@RequestMapping(value="add/{a}/{b}/{c}/{d}/{e}")
	int add(@PathVariable int a,@PathVariable int b,@PathVariable int c,@PathVariable int d,@PathVariable int e) {
		int f=a+b+c+d+e;
		return f;
	}

}
