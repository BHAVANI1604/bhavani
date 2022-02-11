package com.products.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.demo.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, Integer> {

}
