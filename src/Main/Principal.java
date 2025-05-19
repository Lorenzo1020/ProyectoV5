package Main;

import java.util.Scanner;

import Implementacion.ImplementacionIngCivil;
import Model.IngCivil;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;

		long cedula;
		String carrera;
		String grado;
		float salario;

		IngCivil civil = null;

		int menuPrin, menuPrincIngCivil;
		
		//Nuevo codigo
		int numero1=20;
		int resultado = numero1*20;
		System.out.println(resultado);

		ImplementacionIngCivil impCivil = new ImplementacionIngCivil();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---CRUD DE ING. CIVIL");
			System.out.println("2---CRUD DE LIC. INFORMTICA");
			System.out.println("3----SALIR");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1: // -------------------CRUD DE ING. CIVIL

				do {
					System.out.println("CRUD DE ING. CIVIL");
					System.out.println("1----ALTA");
					System.out.println("2---MOSTRAR");
					System.out.println("3----BUSCAR");
					System.out.println("4---EDITAR");
					System.out.println("5---ELIMINAR");
					System.out.println("6---REGRESAR M.P.");

					lectura = new Scanner(System.in);
					menuPrincIngCivil = lectura.nextInt();

					switch (menuPrincIngCivil) {
					case 1:
						try {
							System.out.println("Ingresa el numero de cedula");
							lectura = new Scanner(System.in);
							cedula = lectura.nextLong();

							System.out.println("Ingresa la carrera");
							lectura = new Scanner(System.in);
							carrera = lectura.nextLine();

							System.out.println("Ingrese el grado");
							lectura = new Scanner(System.in);
							grado = lectura.nextLine();

							System.out.println("Ingrese el salario");
							lectura = new Scanner(System.in);
							salario = lectura.nextFloat();

							// Creal el objeto
							civil = new IngCivil(cedula, carrera, grado, salario);

							// Agregarlo al hasMap
							impCivil.guardar(civil);
							System.out.println("Se guardo");

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error al guardar " + e.getMessage());
						}
						break;
					case 2:
						impCivil.mostrar();
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					}

				} while (menuPrincIngCivil < 6);

				break;
			case 2: // -------------------CRUD DE LIC. INFORMATICA
				break;
			case 3:
				break;
			}

		} while (menuPrin < 3);
	}

}
