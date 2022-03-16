package com.products.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.products.demo.model.ProductModel;
import com.products.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	@PostMapping("/add")
	public void addProduct(@RequestBody ProductModel productModel) {
		productService.addProduct(productModel);
	}
	@GetMapping("/getAll")
	public List<ProductModel>getall(){
		return productService.getall();
	}
	@PutMapping("/update/{id}")
	public void productUpdate(@RequestBody ProductModel productModel, @PathVariable Integer id) {
		productService.productUpdate(productModel,id);
	}
	@GetMapping("/getById/{id}")
		public Optional<ProductModel>findWithId(@PathVariable Integer id){
		return productService.findWithId(id);
		
		
	}
	@DeleteMapping("/delete/{id}")
	public void ProductDelete(@PathVariable Integer id) {
		 productService.productDelete(id);
	}
	@GetMapping("/getName/{name}")
	public List<ProductModel>getName(@PathVariable String name){
		return productService.getName(name);
	}
     @GetMapping("/getInfo")
     public List<Object>getInf(){
    	 return productService.getInfo();
     }
	}
	


