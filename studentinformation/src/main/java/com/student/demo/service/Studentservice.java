package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dao.StudentDAO;
import com.student.demo.model.StudentModel;

@Service
public class Studentservice {
	@Autowired
	StudentDAO studentDAO;

	public List<StudentModel> getAllInfo() {
		return studentDAO.getAllInfo();
	}

	// public int addStudent(String name, String standard, String course, String
	// aadharid) {
	public int addStudent(Integer id, String name, String standard, String course, String aadhaar) {

		return studentDAO.addstudent(id, name, standard, course, aadhaar);
		// return sd.addstudent(student);

	}

	public int deletestudent(int id) {

		return studentDAO.deletestudent(id);
	}

	// public int update(StudentModel sm, int id) {

	// return sd.update(sm, id);
	// }

	public void addStudentDetails(StudentModel student) {
		studentDAO.addStudentDetails(student);

	}

	public void updateStudent(StudentModel student, int id) {
		studentDAO.updateStudent(student, id);

	}

	public StudentModel findOneId(Integer id) {

		return studentDAO.findOneId(id);
	}

}// public int update(BookModel bm,int bookid) {

// return bookdao.update(bm, bookid);
//}
