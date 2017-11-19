package com.example.classroom;

import java.util.ArrayList;

public class Classroom {
	private String classroomName = "Kvalit17";
	private String classroomTerm = "Fall2017";
	// How declare arraylist?
	private ArrayList<Student> students = new ArrayList<Student>();

	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;
	}

	// ?? I added void, makes sense to me. Solve syntax! 
	public void removeAStudent(String firstName) {

		// This could possibly be in if statement?
		// Search students arraylist for firstName

		// if(student exist in arraylist){
		// remove student from arrayList
		// return System.out.println("Student "+ firstName + "was successfully
		// removed.");
		// }else{
		// System.out.println("The student does not exist!");
		// }

	}

	// ?? says nothing about void but doesnt seem to need to return.. I add void.
	public void addANewStudent(Student student) {

		this.students.add(student);

		// Next line not needed?
		// setStudents(students);

		// return student;

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
