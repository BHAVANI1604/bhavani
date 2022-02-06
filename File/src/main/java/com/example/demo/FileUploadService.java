package com.example.demo;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service
public class FileUploadService {
	@Autowired
	FileUploadDAO fileUploadDAO;
	public String uploadFile()  throws IllegalStateException, IOException{
	
		file.transferTo(new File("C:\\Users\\HP\\Downloads\\abi"+ file.getOriginalFilename()));
	 return fileUploadDAO.uploadFile(file);
	}
	}

