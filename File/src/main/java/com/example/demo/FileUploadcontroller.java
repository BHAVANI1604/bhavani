package com.example.demo;

import java.io.IOException;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadcontroller {
@Autowired
FileUploadService fileUploadService;
@RequestMapping(value ="/update",method = RequestMethod.POST)	
	public String uploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		fileUploadService.uploadFile(file);
		return fileUploadService.uploadFile(file);
}
}