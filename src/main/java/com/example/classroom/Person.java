package com.example.classroom;

public class Person {
	private int age = 30;
	private String firstName = "Madeleine";
	private String lastName = "Barwén";
	private char gender = 'F';

	public Person(int age, String firstName, String lastName, char gender) {

		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
