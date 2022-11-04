package dam1.prog.ejercicios01;

import java.util.Scanner;

public class ParImpar0 {

	public static void main(String[] args) {
		int numero;
		Scanner num = new Scanner(System.in);

		System.out.print("Introduzca número: ");
		numero = num.nextInt();
//Igual que ejercicio anterior pero a mayores metemos igualdad ==0
		if (numero == 0) {
			System.out.println("Es 0");
		} else if (numero % 2 != 0) {
			System.out.println("No es par");
		} else if (numero % 2 == 0) {
			System.out.println("Es par");
		}

		num.close();
	}

}