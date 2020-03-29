package com.myuniversity.java;
import java.util.Scanner;

import com.myuniversity.java.Teacher;

public class Class {
	
	public String[] nameClass = new String[30];
	public String[] classroom = new String[30];
	
	public void initializingClasses () {
		
		nameClass[0] = "Biologia";
		nameClass[1] = "Sociales";
		nameClass[2] = "Religion";
		
		classroom[0] = "AA1";
		classroom[1] = "AA1";
		classroom[2] = "AA1";
		
		int i;
		
		for (i=0; i<=3; i++) {
			int j;
			for (j=0; j<=3; j++) {
				System.out.println("Class's name: " + nameClass[i] + "Classroom's name: " + classroom[i] + "Teacher's name: " + nameTeacher[i] + "Student's name: " + nameStudent[j] );
			}
		}
				
	}
	
	public void createClass () {
		Scanner tecladoNameStudent = new Scanner(System.in);
		Scanner tecladoIdStudent = new Scanner(System.in);
		
		System.out.println("Enter the name of student: ");
		nameClass[6] = tecladoNameStudent.toString();
		System.out.println("Enter the name of student: ");
		classroom[6] = tecladoIdStudent.toString();
		
		int i;
		
		for (i=0; i<=4; i++) {
			int j;
			for (j=0; j<=4; j++) {
				System.out.println("Class's name: " + nameClass[i] + "Classroom's name: " + classroom[i] + "Teacher's name: " + nameTeacher[i] + "Student's name: " + nameStudent[j] );
			}
		}

	}




}
