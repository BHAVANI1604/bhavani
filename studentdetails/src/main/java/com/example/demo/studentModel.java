package com.example.demo;

public class studentModel {
private int no;
private String name;
private int standard;
private String course;
private int Aadharid;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public studentModel(int no, String name, int standard, String course, int aadharid) {
	
	this.no = no;
	this.name = name;
	this.standard = standard;
	this.course = course;
	Aadharid = aadharid;
}
@Override
public String toString() {
	return "studentModel [no=" + no + ", name=" + name + ", standard=" + standard + ", course=" + course + ", Aadharid="
			+ Aadharid + "]";
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getAadharid() {
	return Aadharid;
}
public void setAadharid(int aadharid) {
	Aadharid = aadharid;
}

}
