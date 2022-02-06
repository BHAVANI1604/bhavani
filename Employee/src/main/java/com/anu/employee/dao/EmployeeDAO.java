package com.anu.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anu.employee.model.Model;
import com.anu.employee.repo.EmployeeRepository;

@Repository
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Model> getAll() {
		Iterable<Model>model=employeeRepository.findAll();
		return (List<Model>)model;
	}

	
	public void addEmployeeDetails(Model model) {
		employeeRepository.save(model);

	}

	public void updateEmployeeDetails(Model model) {
		employeeRepository.save(model).getId();

	}


	public Optional<Model> getOneEmployeeDetails(Integer id) {
		
		return employeeRepository.findById(id); 
	}


	public void deleteEmployeeDetails(Integer id) {
		employeeRepository.deleteById(id);
		
	}

	
}
