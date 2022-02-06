package com.student1.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student1.demo.dao.StudentDao;
import com.student1.demo.model.StudentModel;
@Service
public class StudentService {
@Autowired	
StudentDao studentDao;
	public List<StudentModel> getAllinfo() {
		
		return studentDao.getAllinfo();
	}
	public void updateStudent(StudentModel studentModel, int id) {
		
		 studentDao.updateStudentDetails(studentModel,id);
	}
	public int deleteStudent(int id) {
		
		return studentDao.deleteStudent(id);
	}
	
	public int addStudentDetails(StudentModel studentModel) {
		return studentDao.addStudentDetails(studentModel);
	}
	//public StudentModel findById(int id) {
		// TODO Auto-generated method stub
	//	System.out.println(id);
	//	return studentDao.findById(id);
	//}
	
	
	
	
}
