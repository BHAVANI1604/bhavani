package com.products.demo.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

@Entity
@Table(name="product")
public class ProductModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private long sku;
private String name;
private float weight;
private int descriptionNo;
private char category;

//@Temporal(TemporalType.TIMESTAMP)
//private Data todayDate;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public long getSku() {
	return sku;
}

public void setSku(long sku) {
	this.sku = sku;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public int getDescriptionNo() {
	return descriptionNo;
}

public void setDescriptionNo(int descriptionNo) {
	this.descriptionNo = descriptionNo;
}

public char getCategory() {
	return category;
}

public void setCategory(char category) {
	this.category = category;
}

//public Data getTodayDate() {
//	return todayDate;
//}
//
//public void setTodayDate(Data todayDate) {
//	this.todayDate = todayDate;
//}





}
