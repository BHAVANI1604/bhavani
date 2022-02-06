package com.student1.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.student1.demo.model.StudentModel;
import com.sun.net.httpserver.Authenticator.Result;

@Repository
public class StudentDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<StudentModel> getAllinfo() {
		List<StudentModel> li = jdbcTemplate.query("select * from students1",
				(result, rowNum) -> new StudentModel(result.getString("name"), result.getInt("id"),
						result.getString("doj"), result.getInt("branch")));

		return li;
	}

	public void updateStudentDetails(StudentModel studentModel, int id) {
		jdbcTemplate.update("update students1 set name=?,id=?,doj=?,branch=?", studentModel.getName(),
				studentModel.getId(), studentModel.getDoj(), studentModel.getBranch());

	}

	public int deleteStudent(int id) {

		return jdbcTemplate.update("delete from students1 where id=?", id);
	}

	public int addStudentDetails(StudentModel studentModel) {
		return jdbcTemplate.update("insert into students1 (name, id, doj,branch) " + "values(?,?,?,?)",
				studentModel.getName(), studentModel.getId(), studentModel.getDoj(), studentModel.getBranch());

	}

	//public Object findById(int id)

	//{
		// String query="select * from students where id=?";
		// StudentModel studentModel=jdbcTemplate.queryForObject(query, new
		// Object[]{id},new BeanPropertyRowMapper<>(StudentModel.class));
		// return studentModel;
	//	System.out.println(id);
	//	return jdbcTemplate.queryForObject("SELECT * FROM students1 WHERE id =" + id,(rs, rowNum) -> new String[]
			//	{rs.getString(1), rs.getString(2), rs.getString(3)});

		// StudentModel s1=(StudentModel) jdbcTemplate.queryForObject("SELECT * FROM
		// students1 WHERE id = ? ",
		// new Object[] {id}, new BeanPropertyRowMapper(StudentModel.class) );
	//}

}
