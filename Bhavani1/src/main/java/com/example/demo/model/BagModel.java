package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Bag")
public class BagModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
	private int price;
	private String brand;

}
