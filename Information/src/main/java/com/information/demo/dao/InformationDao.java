package com.information.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.information.demo.model.InformationModel;
import com.information.demo.repo.InformationRepository;
@Repository
public class InformationDao {
@Autowired
  InformationRepository informationRepository;
	public List<InformationModel> getAllinfo() {
		Iterable<InformationModel>informationModel=informationRepository.findAll();
		return (List<InformationModel>)informationModel;
	}
	
	public void add(InformationModel informationModel) {
		
		informationRepository.save(informationModel);
		System.out.println("data added");
	}

	public Optional<InformationModel> findWithId(Integer id) {
		
		return informationRepository.findById(id);
	}

	public void updateInfo(InformationModel informationModel) {
		informationRepository.save(informationModel).getId();
		
	}

	public void deleteId(Integer id) {
		informationRepository.deleteById(id);
		
	}

	public List<InformationModel> getByName(String name) {
		List<InformationModel> list = informationRepository.getByName(name);
		return list;
	}

	public List<String> getAllBranchList() {
		List<String> list = informationRepository.getAllBranchList();
		return list;
	}
	public List<Object> getInfo(){
		List<Object>list=informationRepository.getInfo();
		return list;
		
	}

	public List<InformationModel> getOrderName() {
		List<InformationModel>list=informationRepository.getOrderName();
		return list;
	}
	

}
	