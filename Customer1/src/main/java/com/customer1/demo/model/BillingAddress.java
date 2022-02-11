package com.customer1.demo.model;

public class BillingAddress {
	private String city;
 @Override
	public String toString() {
		return "BillingAddress [city=" + city + ", state=" + state + "]";
	}
public BillingAddress(String city) {
		super();
		this.city = city;
	}
private String state;


}
