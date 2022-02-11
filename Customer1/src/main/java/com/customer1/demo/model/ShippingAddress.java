package com.customer1.demo.model;

public class ShippingAddress {
	
	private String city;
	private String name;
	public ShippingAddress(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ShippingAddress [city=" + city + ", name=" + name + "]";
	}

}
