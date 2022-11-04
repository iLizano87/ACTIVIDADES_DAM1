package dam1.prog.ejercicios03;

import java.util.Scanner;

public class CalculadoraFunciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int elec;
		// Selector de operacion
		System.out.println("Operación a realizar: ");
		System.out.println("1 - SUMAR ");
		System.out.println("2 - RESTAR ");
		System.out.println("3 - MULTIPLICAR ");
		System.out.println("4 - DIVIDIR ");
		elec = sc.nextInt();
		if (elec == 1) {
			System.out.println("Introduce numero a: ");
			num1 = sc.nextInt();
			System.out.println("Introduce numero b: ");
			num2 = sc.nextInt();
			suma(num1, num2);
		} else if (elec == 2) {
			System.out.println("Introduce numero a: ");
			num1 = sc.nextInt();
			System.out.println("Introduce numero b: ");
			num2 = sc.nextInt();
			resta(num1, num2);
		} else if (elec == 3) {
			System.out.println("Introduce numero a: ");
			num1 = sc.nextInt();
			System.out.println("Introduce numero b: ");
			num2 = sc.nextInt();
			multiplica(num1, num2);
		} else if (elec == 4) {
			System.out.println("Introduce numero a: ");
			num1 = sc.nextInt();
			System.out.println("Introduce numero b: ");
			num2 = sc.nextInt();
			divide(num1, num2);
		}
		sc.close();
	}

//Se imprime resultado en la funcion
	// Funcion suma
	public static void suma(int a, int b) {
		int resultado = a + b;
		System.out.println("El resultado de la suma es: " + resultado);
	}

	// Funcion resta
	public static void resta(int a, int b) {
		int resultado = a - b;
		System.out.println("El resultado de la resta es: " + resultado);
	}

	// Funcion multiplica
	public static void multiplica(int a, int b) {
		int resultado = a * b;
		System.out.println("El resultado de la multiplicación es: " + resultado);
	}

	// Funcion divide
	public static void divide(float a, float b) {
		float resultado = a / b;
		System.out.println("El resultado de la división es: " + resultado);
	}
}
