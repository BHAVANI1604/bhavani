package com.anu.employee.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.anu.employee.model.Model;


public interface EmployeeRepository extends CrudRepository<Model,Integer> {

	

}


