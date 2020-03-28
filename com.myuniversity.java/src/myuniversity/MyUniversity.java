package myuniversity;

import java.util.Scanner;

public class MyUniversity {

	public static void main(String args[]) {

		Scanner tecladoOptionMenu = new Scanner(System.in);
		int optionMenu = 0;
		int bandera = 0;

		do {
			do {
				System.out.println("1 --> Print all the teachers ");
				System.out.println("2 --> Print all the classes "); // aqui se requiere que al seleccionar active otro
																	// menú y ver el detalle de esa clase
				System.out.println("3 --> Create a new student ");
				System.out.println("4 --> Create a new class "); // agregando teacher, student, etc.
				System.out.println("5 --> List all the classes by Id Student ");
				System.out.println("6 --> Exit ");
				System.out.println("Please enter the option you wish to consult... ");
				optionMenu = tecladoOptionMenu.nextInt();

				if (optionMenu >= 1 && optionMenu <= 6) {
					bandera = 1;

				} else {
					System.out.println("-----------------------------------------------");
					System.out.println("Option not available!");
					System.out.println("-----------------------------------------------");
				}

			} while (bandera == 0);

			if (optionMenu == 1) {
				System.out.println("Print all the teachers: ");
				Teacher mailman = new Teacher ();
				mailman.resultadoTeachers();

			} else if (optionMenu == 2) {
				System.out.println("Print all the classes: ");

			} else if (optionMenu == 3) {
				System.out.println("Create a new student: ");

			} else if (optionMenu == 4) {
				System.out.println("Create a new class: ");

			} else if (optionMenu == 5) {
				System.out.println("List all the classes by Id Student: ");

			} else if (optionMenu == 6) {
				System.out.println("-----------------------------------------------");
				System.out.println("Exit ¡Thanks!");
				System.out.println("-----------------------------------------------");
				bandera = 2;
			}

		} while (bandera != 2);
		
		tecladoOptionMenu.close();

	}

}
