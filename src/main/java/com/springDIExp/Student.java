package com.springDIExp;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int studentID;
	
	private String studentName;
	
	@Autowired
	private Address address;

	public Student(int studentID, String studentName, Address address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
	}
	
	public Student() {
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + "]";
	}
}
