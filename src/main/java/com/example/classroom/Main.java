package com.example.classroom;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> stundentsAL = new ArrayList<Student>();

		Classroom cr = new Classroom("Java1", "Spring2018", stundentsAL);

		Student stud1 = new Student(18, "Jenny", "Hoverman", 'F');
		Student stud2 = new Student(21, "Henry", "Anatano", 'M');
		Student stud3 = new Student(18, "Emmet", "Trollqvist", 'M');
		
		cr.addANewStudent(stud1);
		cr.addANewStudent(stud2);
		cr.addANewStudent(stud3);
		
		cr.printFullRelatory();
	}

}
