package com.abhlive.stream.model;

import java.time.LocalDate;

public class Person {
	
	private String name;
	
	private int age;
	
	private LocalDate dateOfBirth;
	
	private String gender;

	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getGender() {
		return gender;
	}
	
//	public String toString() {
//		return "Person ["+ this.name + "," + this.age + "]";
//	}
	
//	public String toString() {
//		return "Person {"+ "name="+ name + ", dateOfBirth=" + dateOfBirth + "}";
//	}
	
	public String toString() {
		return "Person ["+ name +", " + age + ", "+gender +"]";
	}
}
