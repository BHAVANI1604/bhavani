package com.products.demo.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.products.demo.model.ProductModel;
import com.products.demo.repo.ProductRepo;
@Repository
public class ProductDao {
@Autowired
ProductRepo productRepo;
	public void addProduct(ProductModel productModel) {
		productRepo.save(productModel);
		System.out.println("data saved");
		
	}
	public List<ProductModel> getall() {
		return productRepo.findAll();

	}
	public void productUpdate(ProductModel productModel,Integer id) {
		productRepo.save(productModel).getId();
		
	}
	public Optional<ProductModel> findWithId(Integer id) {
		
		return productRepo.findById(id);
	}
	public void productDelete(Integer id) {
		
		 productRepo.deleteById(id);
	}
	public List<ProductModel> getName(String name) {
		List<ProductModel>li=productRepo.getByName(name) ;
		return li;

	}
	public List<Object> getInfo() {
		List<Object>li=productRepo.getInfo();
		return li;
	}


}
