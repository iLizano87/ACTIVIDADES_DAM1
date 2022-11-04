package dam1.prog.ejercicios04;

import java.util.Scanner;

public class Potencia {

	/**
	 * @param double a
	 * @param double b
	 * @return resultado (el numero*numero las veces que especifiquemos)
	 */
	public static double calcularPotencia(double a, double b) {
		double resultado = 1;
		if (a > 0 && b == 0) {
			return resultado;
		} else if (a == 0 && b >= 1) {
			return 0;
		} else {
			for (int i = 1; i <= b; i++) {
				resultado = resultado * a;
			}
			return resultado;
		}
	}
	public static void main(String[] args) {
		double num1;
		double num2;
		double total;
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce número: ");//Pedimos numero
		num1 = numero.nextInt();
		System.out.println("Introduce potencia: ");//Pedimos potencia
		num2 = numero.nextInt();
		total = calcularPotencia(num1, num2);
		System.out.println("Has elevado " + num1 + " a la " + num2 + " y el resultado es: " + total);
	}
}
