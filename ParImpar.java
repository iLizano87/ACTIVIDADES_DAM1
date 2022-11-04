package dam1.prog.ejercicios01;

import java.util.Scanner;

public class ParImpar {

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

//Si el resto del numero es 0 entonces es par
	public static void main(String[] args) {
		int numero;
		Scanner num = new Scanner(System.in);

		System.out.print("Introduzca número: ");
		numero = num.nextInt();

		if (esPar(numero)) {
			System.out.println("Sí es par");
		} else {
			System.out.println("No es par");
		}
//Nos muestra si es par o no
		num.close();
	}

}
