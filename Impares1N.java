package dam1.prog.ejercicios02;

import java.util.Scanner;

public class Impares1N {

	public static void main(String[] args) {
		int num;
		Scanner impar = new Scanner(System.in);
		System.out.println("Ingrese hasta que número impar quiere mostrar: ");
		num = impar.nextInt();
		int x = 0;
		for (x = 0; x <= num; x++) {
			if ((x % 2) != 0) {
				// Nos muestra los numeros con resto distinto a 0 (impares) e imprime por
				// pantalla
				System.out.println("Números impares: " + x);
			}
			impar.close();
		}
	}
}
