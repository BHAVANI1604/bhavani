package com.information.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.information.demo.dao.InformationDao;
import com.information.demo.model.InformationModel;
@Service
public class InformationService {
@Autowired
InformationDao informationDao;
	public List<InformationModel> getAllinfo() {
		
		return informationDao.getAllinfo();
	}
	public void add(InformationModel informationModel) {
		
		 informationDao.add(informationModel);
	}
	public Optional<InformationModel> findWithId(Integer id) {
		
		return informationDao.findWithId(id);
	}
	public void updateInfo(InformationModel informationModel) {
		informationDao.updateInfo(informationModel);
		
	}
	public void deleteId(Integer id) {
		informationDao.deleteId(id);
		
	}
	public List<InformationModel> getByName(String name) {
		return informationDao.getByName(name);
	}
	public List<String> getAllBranchList() {
		return informationDao.getAllBranchList();
	}
	public List<Object> getInfo() {
		
		return informationDao.getInfo();
	}
	public List<InformationModel> getOrderName() {
		
		return informationDao.getOrderName();
	}

}
