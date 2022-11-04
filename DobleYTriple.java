package dam1.prog.ejercicios01;

import java.util.Scanner;

public class DobleYTriple {

	public static void main(String[] args) {
		int numero;
		int resultado2;
		int resultado3;

		// CON LA UTILIDAD SCANNER SE TOMA EL DATO DE ENTRADA
		Scanner num = new Scanner(System.in);

		System.out.println("Ingrese numero para realizar el doble y triple:");
		numero = num.nextInt();

		resultado2 = (numero * 2);
		resultado3 = (numero * 3);

		// SE MUESTRA EL RESULTADO como variables x2 y x3
		System.out.println("El doble del número " + numero + " es " + resultado2 + " y el triple es " + resultado3);
		num.close();
	}
}
