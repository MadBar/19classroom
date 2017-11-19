package com.example.classroom;

import java.text.DecimalFormat;

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

	// How I interpret guide
	public double calculateAverageGrade() {
		// Unnecessary to use getters and setters??
		double firstGrade = getFirstGrade();
		double secondGrade = getSecondGrade();
		double thirdGrade = getThirdGrade();

		setAverageGrade(firstGrade + secondGrade + thirdGrade / 3);
		double averageGrade = getAverageGrade();

		return averageGrade;
	}

	// void?
	// Full off guesses. Should I use setters here instead?
	public double calculateAverageGrade(double firstGrade, double secondGrade, double thirdGrade) {
		// Option one my, doubting cause guid dont mention setters:
		// setFirstGrade(firstGrade);
		// setSecondGrade(secondGrade);
		// setThirdGrade(thirdGrade);

		// Do i need to save inputs in new variables or does this work?
		setAverageGrade(firstGrade + secondGrade + thirdGrade);
		double averageGrade = getAverageGrade();

		return averageGrade;
	}

	public boolean hasClearedTheCourse() {
		boolean hasCleared = false;

		if (getAverageGrade() < 6.0) {

		} else {
			hasCleared = true;
		}

		return hasCleared;
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

	// Cant get the [] and the "," away from printing arrayList. Find and override
	// how arraylist is printed?
	@Override
	public String toString() {
		calculateAverageGrade(this.firstGrade, this.secondGrade, this.thirdGrade);
		DecimalFormat df = new DecimalFormat("#.0");
		if (hasClearedTheCourse()) {
			return "\nStudent: " + getFirstName() + " " + getLastName() + "\nGrades: " + getFirstGrade() + ", "
					+ getSecondGrade() + ", " + getThirdGrade() + "\nFinal Grade: " + df.format(getAverageGrade())
					+ "\nThe student has cleared the course" + "\n-----------------------------\n";
		} else {
			return "\nStudent: " + getFirstName() + " " + getLastName() + "\nGrades: " + getFirstGrade() + ", "
					+ getSecondGrade() + ", " + getThirdGrade() + "\nFinal Grade: " + df.format(getAverageGrade())
					+ "\nThe student has NOT cleared the course" + "\n-----------------------------\n";
		}
	}

}
