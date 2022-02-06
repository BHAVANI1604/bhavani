package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BagModel;
import com.example.demo.service.BagService;
@RestController
@RequestMapping("/bag")
public class BagController {
	@Autowired
	BagService bagService;
	@PostMapping("/save")
	public void addInfo(@RequestBody BagModel bagModel) {
		bagService.addInfo(bagModel);
	}

}
