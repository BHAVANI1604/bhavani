package com.information.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.information.demo.model.InformationModel;
import com.information.demo.service.InformationService;

@RestController
@RequestMapping("/information")
public class InformationController {
	@Autowired
	InformationService informationService;

	@GetMapping("/getAll")
	public List<InformationModel> getAllinfo() {
		return informationService.getAllinfo();
	}

	@PostMapping("/add")

	public void addInfo(@RequestBody InformationModel informationModel) {
		informationService.add(informationModel);

	}

	@GetMapping("/findById/{id}")
	public Optional<InformationModel> findWithId(@PathVariable Integer id) {
		return informationService.findWithId(id);
	}

	@PutMapping("/update/{id}")
	public void updateInfo(@RequestBody InformationModel informationModel) {
		informationService.updateInfo(informationModel);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteId(@PathVariable Integer id) {
		informationService.deleteId(id);
	}

	@GetMapping("/getname/{name}")
	public List<InformationModel> getByName(@PathVariable String name) {
		return informationService.getByName(name);
	}
	
	@GetMapping("/getbranch")
	public List<String> getAllBranchList(){
		return informationService.getAllBranchList();
	}
	@GetMapping("/info")
	public List<Object>getInfo(){
		return informationService.getInfo();
	}
	@GetMapping("/nameOrder")
	public List<InformationModel> getOrderName(){
	return informationService.getOrderName();

}}
