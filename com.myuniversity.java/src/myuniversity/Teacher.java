package myuniversity;

public class Teacher {

	public String[] nameTeacher = new String[30];
	public boolean[] typeTime = new boolean[1];
	public double[] salary = new double[10]; // true=full time, false=part time.
	public int[] experience = new int[2];
	public int[] hoursWeek = new int[2];
	public double baseSalary = 2000000;
	
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
		int j;
		for(j=0; j<=3; j++) {
			System.out.println("El profesor " + j + " Nombre: " + nameTeacher[j] + ". Contrato Full time(true)/Part time(false): " + typeTime[j] + ". Salario: COP $" + salary[j]);
		}
	}
	

	
}

