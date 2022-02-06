package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class FileUploadDAO {
	@Autowired
	JdbcTemplate temp;
	
	//public int addItem(String name, String city) {
	//	String query="insert into stude(name,city)values(?,?)";
		//return temp.update(query,name,city);
	//}
	public String uploadFile(MultipartFile file) {
		String query="insert into Files(Upload)values(?)";
	return temp.uploadFile(file);
	}
}
