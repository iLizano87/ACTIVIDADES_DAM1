package dam1.prog.ejercicios02;

import java.util.Scanner;

public class InfinitoN {

	public static void main(String[] args) {
		int n;
		int num;
		Scanner inf = new Scanner(System.in);
		System.out.println("Introduce n vueltas en el bucle: ");
		n = inf.nextInt();
		for (num = 0; num < n; num++) {
			System.out.println("Salimos en el bucle nº " + n);
			inf.close();
		}
		// Se reproduce bucle infinito las veces n que introduzcamos
		// Se reproduce bucle infinito las veces n que introduzcamos
	}
}
