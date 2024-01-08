package com.springDIExp;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int studentID;
	
	private String studentName;
	
	@Autowired
	@Qualifier("adr")
	private Address address;
	
	private List<String> hobbies;
	
	private Set<String> skills;
	
	private Map<String, Address> addressMap;

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
	
	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Map<String, Address> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, Address> addressMap) {
		this.addressMap = addressMap;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + "]";
	}
}
