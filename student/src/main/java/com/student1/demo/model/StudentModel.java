package com.student1.demo.model;

public class StudentModel {
	private String name;
	private int id;
	private String doj;
	public StudentModel(String name, int id, String doj, int branch) {
		
		this.name = name;
		this.id = id;
		this.doj = doj;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "StudentModel [name=" + name + ", id=" + id + ", doj=" + doj + ", branch=" + branch + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	private int branch;
}