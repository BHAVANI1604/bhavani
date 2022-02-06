package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {
	@Autowired
	studentservice s;
	
	@RequestMapping(value="getalldetails",method=RequestMethod.GET)
	public List<studentModel>getalldetails() {
		return s.getalldetails();
	}
	

}
