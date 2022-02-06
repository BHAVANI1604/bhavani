package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BagDao;
import com.example.demo.model.BagModel;
@Service
public class BagService {
@Autowired 
 BagDao bagDao;
	public void addInfo(BagModel bagModel) {
		bagDao.addInfo(bagModel);
		System.out.println("data added");
		
	}

}
