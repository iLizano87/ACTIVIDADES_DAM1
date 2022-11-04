package dam1.prog.ejercicios02;

import java.util.Scanner;

public class RangoNM {

	public static void main(String[] args) {

		Scanner rango = new Scanner(System.in);
		int n;
		int m;
		int x;
		// Nos pide 3 variables tipo entero
		System.out.println("Introduzca numero inicio rango n: ");
		n = rango.nextInt();
		System.out.println("Introduzca numero fin rango m: ");
		m = rango.nextInt();
		System.out.println("Introduzca numero x para comprobacion: ");
		x = rango.nextInt();
//Muestra los distintos casos segun rango
		if (x < n) {
			System.out.println(+x + " Está por debajo de " + n);
		} else if (x >= n && x <= m) {
			System.out.println(+x + " Está entre " + n + " " + m);
		} else if (x > m) {
			System.out.println(+x + " Está por encima de " + m);
		}
		rango.close();
	}

}
