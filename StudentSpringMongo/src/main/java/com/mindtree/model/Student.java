package com.mindtree.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	private String location;
	private String dateOfBirth;
	public Student(int id,String name, int age, String location, String dateOfBirth) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.location = location;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [Student Id =" + getId() + ", Student Name =" + getName() + ", Student Age =" + getAge()
				+ ", Student Location =" + getLocation() + ", Student DateOfBirth =" + getDateOfBirth() + "]";
	}

}

