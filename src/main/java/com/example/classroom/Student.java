package com.example.classroom;

public class Student extends Person {
	private double firstGrade = 5.0;
	private double secondGrade = 5.0;
	private double thirdGrade = 5.0;
	private double averageGrade = 5.0;

	public Student(int age, String firstName, String lastName, char gender) {
		super(age, firstName, lastName, gender);

	}

	public Student(int age, String firstName, String lastName, char gender, double firstGrade, double secondGrade,
			double thirdGrade, double averageGrade) {
		super(age, firstName, lastName, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}
	
	//void??
	public void calculateAverageGrade() {

	}
	
	//void?
	public void calculateAverageGrade(double firstGrade, double secondGrade, double thirdGrade) {

	}
	
	//Hmm..? How? This is just guesses
	public boolean hasClearedTheCourse() {
		boolean hasCleared = false;
		return hasCleared;
	}

	//What should be in the string? Put name etc in? 
	@Override
	public String toString() {
		return "Student [firstGrade=" + firstGrade + ", secondGrade=" + secondGrade + ", thirdGrade=" + thirdGrade
				+ ", averageGrade=" + averageGrade + "]";
	}

	public double getFirstGrade() {
		return firstGrade;
	}
	
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public double getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public double getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
}
