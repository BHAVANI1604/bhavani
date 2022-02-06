package com.anu.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anu.employee.dao.EmployeeDAO;
import com.anu.employee.model.Model;

@Service
public class EmployeeService {
  
  @Autowired
  EmployeeDAO employeeDAO;

	public List<Model> getAll() {
		
		return employeeDAO.getAll();
	}
	public void addEmployeeDetails(Model model)
	{
		employeeDAO.addEmployeeDetails(model);
	}
	public void updateEmployeeDetails(Model model)
	{
		employeeDAO.updateEmployeeDetails(model);
	}
	public Optional<Model> getOneEmployeeDetails(Integer id) {
		return employeeDAO.getOneEmployeeDetails(id);

	}
	public void deleteEmployeeDetails(Integer id) {
		employeeDAO.deleteEmployeeDetails(id);
		
	}
	
}
