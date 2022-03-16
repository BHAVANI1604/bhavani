package com.products.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.products.demo.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, Integer> {
	@Query(value="SELECT * FROM product WHERE Name LIKE %:name%",nativeQuery = true)
		public List<ProductModel>getByName(@Param("name")String name);
		
	@Query(value="select id,name from product",nativeQuery = true)	
	public List<Object> getInfo();
		
	}
	



