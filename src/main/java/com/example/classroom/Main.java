package com.example.classroom;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> stundentsAL = new ArrayList<Student>();

		Classroom cr = new Classroom("Java1", "Spring2018", stundentsAL);

		Student stud1 = new Student(18, "Jenny", "Hoverman", 'F');
		Student stud2 = new Student(21, "Henry", "Anatano", 'M', 3.1, 2.2, 1.5);
		Student stud3 = new Student(18, "Emmet", "Trollqvist", 'M', 5, 4.3, 4.1);

		cr.addANewStudent(stud1);
		cr.addANewStudent(stud2);
		cr.addANewStudent(stud3);

		// You can add grades later like this or set it when u create student as above.
		stud1.setFirstGrade(2);
		stud1.setSecondGrade(1.2);
		stud1.setThirdGrade(2.7);

		System.out.println("################ STUDENT LIST ###############");
		cr.printFullRelatory();

		// Following 2 lines do same thing same person. Try both see if works the same
		// way.
		// cr.removeAStudent(stud1.getFirstName());
		cr.removeAStudent("Jenny");

		// Remove non existing Student
		cr.removeAStudent("Madeleine");

		System.out.println();
		cr.printFullRelatory();

		Student stud4 = new Student(30, "Madeleine", "Trollvik", 'F');
		cr.addANewStudent(stud4);
		stud4.setFirstGrade(4.3);
		stud4.setSecondGrade(5);
		stud4.setThirdGrade(4.9);

		System.out.println();
		cr.printFullRelatory();
	}

}
