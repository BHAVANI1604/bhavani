package com.customer1.demo.model;

public class CustomerModel {
	private int id;
	private String email;
	private String full_name;
	private BillingAddress billing_address;
	private ShippingAddress shipping_address;
    private String country;
    private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public BillingAddress getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(BillingAddress billing_address) {
		this.billing_address = billing_address;
	}
	public ShippingAddress getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(ShippingAddress shipping_address) {
		this.shipping_address = shipping_address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
}
