package com.myuniversity.java;

public class Teacher {

	protected String[] nameTeacher = new String[30];
	protected boolean[] typeTime = new boolean[1];
	protected double[] salary = new double[10]; // true=full time, false=part time.
	protected int[] experience = new int[2];
	protected int[] hoursWeek = new int[2];
	protected double baseSalary = 2000000;
	
	public void initializingTeachers () {
		nameTeacher[0] = "Ana";
		nameTeacher[1] = "Sofia";
		nameTeacher[2] = "Milo";
		nameTeacher[3] = "Andrews";
		
		typeTime[0] = true;
		typeTime[1] = false;
		typeTime[2] = true;
		typeTime[3] = false;
		
	}
	
	public void validatingSalary() {
		int i;
		
		for (i=0; i<=3; i++) {
			
			if (typeTime[i]=true) {
				experience [i] = (1 + i);
				salary[i] =  ((baseSalary*110)*(experience[i]))/100;

			} else {
				hoursWeek [i] = (20 * i);
				salary[i] =  ((baseSalary/192)*(hoursWeek[i]));
			}
		}
	}
	
	public void resultadoTeachers () {
		int j=0;
		for(j=0; j<4; j++) {
			System.out.println("The professor " + j + " Name: " + nameTeacher[j] + ". Contract Full time(true)/Part time(false): " + typeTime[j] + ". Salary: COP $" + salary[j]); //probando
		}
	}
	

	
}

