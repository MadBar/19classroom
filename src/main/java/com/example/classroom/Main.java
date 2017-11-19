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

		stud1.setFirstGrade(2);
		stud1.setSecondGrade(1);
		stud1.setThirdGrade(2);

		stud2.setFirstGrade(3);
		stud2.setSecondGrade(2);
		stud2.setThirdGrade(1);

		stud3.setFirstGrade(5);
		stud3.setSecondGrade(4);
		stud3.setThirdGrade(4);

		cr.printFullRelatory();

		// Following 2 lines do same thing same person. Try both see if works the same
		// way.
		//cr.removeAStudent(stud1.getFirstName());
		cr.removeAStudent("Jenny");
		
		//Remove non existing Student
		cr.removeAStudent("Madeleine");
		
		System.out.println();
		cr.printFullRelatory();
	}

}
