package com.student1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student1.demo.model.StudentModel;
import com.student1.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
@GetMapping("/getAll")
public List<StudentModel>getAllinfo(){
	return studentService.getAllinfo();
}

	

@PutMapping("/update/{id}") 
public void updateStudent(@RequestBody StudentModel studentModel, @PathVariable int id) {
	studentService.updateStudent(studentModel,id);
}	
	
	
@DeleteMapping("/delete/{id}") 
public int deleteStudent(@PathVariable int id ) {
	return studentService.deleteStudent(id);
	


}
@PostMapping("/add")
public int addStudentDetails(@RequestBody StudentModel studentModel) {
	return studentService.addStudentDetails(studentModel);
}
//@GetMapping("/find/{id}")
//public StudentModel findById(@PathVariable int id) {
//	System.out.println("bhi");
//	return studentService.findById(id);
	
//}
	
	
	

}
