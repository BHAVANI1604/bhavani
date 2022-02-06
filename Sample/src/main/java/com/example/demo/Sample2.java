package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Sample2 {
	@RequestMapping("/Electronics")
	public String name()
	{
		return " Welcome to General Electronics Section";
	}
	
	@RequestMapping("/Mobiles")

	String work() {
		return "Welcome to Mobile section";
	}
 
}
