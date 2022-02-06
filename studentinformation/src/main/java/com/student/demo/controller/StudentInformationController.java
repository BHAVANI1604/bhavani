package com.student.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.StudentModel;
import com.student.demo.service.Studentservice;

@RestController
@RequestMapping("/student")
public class StudentInformationController {

	@Autowired
	Studentservice studentservice;

	@GetMapping("/getAll")
	public List<StudentModel> getAllInfo() {
		return studentservice.getAllInfo();
	}
	/*
	 * @PostMapping("/add") public String addstudent(@PathVariable Integer
	 * id, @PathVariable String name, @PathVariable String standard, @PathVariable
	 * String course, @PathVariable String aadhaar){
	 * if(studentservice.addStudent(id, name, standard, course, aadhaar)>=1) {
	 * return "data added"; }else { return "data error"; } }
	 */

	@PostMapping("/add")
	public String addStudent(@RequestBody StudentModel student) {
		studentservice.addStudentDetails(student);
		return "Success";
	}

//{
	// return studentservice.addStudent(student);
	// return studentservice.addStudent(id,name,standard,course,aadhaar);
//}

//@RequestMapping(value="/delete student/{id}",method=RequestMethod.DELETE)
	@DeleteMapping("/delete/{id}")
	public int deletestudentbyid(@PathVariable int id) {
		return studentservice.deletestudent(id);
	}

//@RequestMapping(value="/Update/{studentid}",method=RequestMethod.PUT)
	@PutMapping("/update/{id}")
	public String updateStudent(@RequestBody StudentModel student, @PathVariable int id) {
		studentservice.updateStudent(student, id);
		return "Update Successfully";
	}
	@GetMapping("/find/{id}")
	public StudentModel findOneId(@PathVariable Integer id)
	{
		return studentservice.findOneId(id);
	}
}
