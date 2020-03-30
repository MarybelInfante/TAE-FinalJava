package com.myuniversity.java;

import java.util.Scanner;

public class Student {

	public String[] nameStudent = new String[30];
	public int[] idStudent = new int[3];
	public int[] ageStudent = new int[3];

	public void initializingStudents() {
		Scanner tecladoNameStudent = new Scanner(System.in);
		Scanner tecladoIdStudent = new Scanner(System.in);
		Scanner tecladoAgeStudent = new Scanner(System.in);

		nameStudent[0] = "Antonio";
		nameStudent[1] = "Andres";
		nameStudent[2] = "Anderson";
		nameStudent[3] = "Antony";
		nameStudent[4] = "Anita";
		nameStudent[5] = "Andrea";

		idStudent[0] = 0;
		idStudent[1] = 1;
		idStudent[2] = 2;
		idStudent[3] = 3;
		idStudent[4] = 4;
		idStudent[5] = 5;

		ageStudent[0] = 10;
		ageStudent[1] = 11;
		ageStudent[2] = 12;
		ageStudent[3] = 13;
		ageStudent[4] = 14;
		ageStudent[5] = 15;

		System.out.println("Enter the name of student: ");
		nameStudent[6] = tecladoNameStudent.toString();
		System.out.println("Enter the name of student: ");
		idStudent[6] = tecladoIdStudent.nextInt();
		System.out.println("Enter the name of student: ");
		ageStudent[6] = tecladoAgeStudent.nextInt();

		int i;
		for (i = 0; i <= 6; i++) {
			System.out.println("Student's name: " + nameStudent[i] + "Student's Id: " + idStudent[i] + "Student's Age: "
					+ ageStudent[i]);
		}
	}

}
