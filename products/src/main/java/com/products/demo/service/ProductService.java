package com.products.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.demo.dao.ProductDao;
import com.products.demo.model.ProductModel;
@Service
public class ProductService {
@Autowired
ProductDao productDao;
	public void addProduct(ProductModel productModel) {
		productDao.addProduct(productModel);
		
	}
	
	public List<ProductModel> getall() {
		
		return productDao.getall();
	}

	public void productUpdate(ProductModel productModel,  Integer id) {
		 productDao.productUpdate(productModel,id);
		
	}

	public Optional<ProductModel> findWithId(Integer id) {
		
		return productDao.findWithId(id) ;
	}

	public void productDelete(Integer id) {
		
		 productDao.productDelete(id);
	}

}
