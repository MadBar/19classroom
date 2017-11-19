package com.example.classroom;

import java.util.ArrayList;

public class Classroom {
	private String classroomName;
	private String classroomTerm;
	private ArrayList<Student> students;

	// ??
	public String removeAStudent(String firstName) {
		return firstName;

	}

	// ??
	public Student addANewStudent(Student student) {
		return student;

	}

	// ?? void?
	public void printFullRelatory() {

	}

	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
