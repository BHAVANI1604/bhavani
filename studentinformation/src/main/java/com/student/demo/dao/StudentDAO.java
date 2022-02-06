package com.student.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.demo.model.StudentModel;

@Repository
public class StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<StudentModel> getAllInfo() {

		List<StudentModel> li = jdbcTemplate.query("select * from student",
				new BeanPropertyRowMapper(StudentModel.class));
		return li;
	}

	// public int addstudent(String name, String standard, String course, String
	// aadhaar) {
	public int addstudent(Integer id, String name, String standard, String course, String aadhaar) {
		String query = "insert into student values(?,?,?,?,?)";
		return jdbcTemplate.update(query, id, name, standard, course, aadhaar);
	}

	public int deletestudent(int id) {

		// String query="select from student where id=?";
		return jdbcTemplate.update("DELETE FROM student WHERE id=?", id);
	}

	// public String update(StudentModel sm,int bookid)
	// {
	// String s="update student set id=?,name=?,standard=?,course=?,Aadhar=?";
	// return jdbcTemplate.update(s,new Object[]
	// {sm.getName(),sm.getStandard(),sm.getCourse(),sm.getAadharNo()});
	// }
	public void addStudentDetails(StudentModel student) {
		jdbcTemplate.update("INSERT INTO student (id,name,standard,course,aadhaar) VALUES(?,?,?,?,?)", student.getId(),
				student.getName(), student.getStandard(), student.getCourse(), student.getAadhaar_No());

	}

	public void updateStudent(StudentModel student, int id) {
		jdbcTemplate.update("UPDATE student SET name = ?, standard = ?, course = ?, aadhaar = ? WHERE id = ?",
				student.getName(), student.getStandard(), student.getCourse(), student.getAadhaar_No(), id);

		System.out.println("DAO Update Successfully");

	}

	public StudentModel findOneId(Integer id) {
		StudentModel student = (StudentModel) jdbcTemplate.queryForObject("SELECT * FROM student WHERE id=?",
				new Object[] { id }, new BeanPropertyRowMapper(StudentModel.class));
		return student;
	}

}
