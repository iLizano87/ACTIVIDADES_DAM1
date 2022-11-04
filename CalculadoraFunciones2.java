package dam1.prog.ejercicios03;

import java.util.Scanner;

public class CalculadoraFunciones2 {
//Funcion suma
	public static int suma(int n1, int n2) {
		int resultado;
		resultado = n1 + n2;
		return resultado;
	}

	// Funcion resta
	public static int resta(int n1, int n2) {
		int resultado;
		resultado = n1 - n2;
		return resultado;
	}

	// Funcion multiplicacion
	public static int multiplica(int n1, int n2) {
		int resultado;
		resultado = n1 * n2;
		return resultado;
	}

	// Funcion division
	public static float divide(float n1, float n2) {
		float resultado;
		resultado = n1 / n2;
		return resultado;
	}

//Cada funcion retorna resultado
	public static void main(String[] args) {
		Scanner introducir = new Scanner(System.in);
		int num1, num2, total, elec;
		float total2;
		boolean salir = false;
		System.out.println("Introduce primer número: ");
		num1 = introducir.nextInt();
		System.out.println("Introduce segundo número: ");
		num2 = introducir.nextInt();
		System.out.println("Indica que quieres realizar: ");
		System.out.println("1- Sumar ");
		System.out.println("2- Restar ");
		System.out.println("3- Multiplicar ");
		System.out.println("4- Dividir ");
		System.out.println("0- Salir ");
// MIENTRAS LA OPCION INTRODUCIDA (NUMERO ENTERO) SEA DISTINTA A LO QUE SE PIDA SE SIGUE EJECUTANDO
		while (!salir) {
			elec = introducir.nextInt();

//Elección de operación 
			switch (elec) {
			case 1:
				// SUMAR
				System.out.println("HA ELEGIDO SUMAR");
				total = suma(num1, num2);
				System.out.println("La suma es: " + total);
				break;
			case 2:
				// RESTAR
				System.out.println("HA ELEGIDO RESTAR");
				total = resta(num1, num2);
				System.out.println("La resta es: " + total);
				break;
			case 3:
				// MULTIPLICAR
				System.out.println("HA ELEGIDO MULTIPLICAR");
				total = multiplica(num1, num2);
				System.out.println("La multiplicación es: " + total);
				break;
			case 4:
				// DIVIDIR
				System.out.println("HA ELEGIDO DIVIDIR");
				total2 = divide(num1, num2);
				System.out.println("La división es: " + total2);
				break;
			case 0:
				// 0 - SALIR
				salir = true;
				break;
			default:
				System.err.println("Introduce un número del 0 al 4:");
				break;
			}
		}
	}
}
