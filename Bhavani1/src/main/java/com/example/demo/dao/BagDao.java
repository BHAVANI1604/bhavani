package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BagModel;
import com.example.demo.repo.BagRepo;
@Repository
public class BagDao {
 @Autowired 
 BagRepo bagRepo;
	public void addInfo(BagModel bagModel) {
		 bagRepo.save(bagModel);
		
	}

}
