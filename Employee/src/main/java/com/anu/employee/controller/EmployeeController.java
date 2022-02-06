package com.anu.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.employee.dao.EmployeeDAO;
import com.anu.employee.model.Model;
import com.anu.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public List<Model> getAll() {
		return employeeService.getAll();
	}

	@PostMapping("/add")
	public void addEmployeeDetails(@RequestBody Model model) {
		employeeService.addEmployeeDetails(model);
	}

	@PutMapping("/update")
	public void updateEmployeeDetails(@RequestBody Model model) {
		employeeService.updateEmployeeDetails(model);
	}

	@GetMapping("/findById/{id}")
	public Optional<Model> getOneEmployeeDetails(@PathVariable Integer id) {
		return employeeService.getOneEmployeeDetails(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeDetails(@PathVariable Integer id)
	{
		employeeService.deleteEmployeeDetails(id);
	}

}
