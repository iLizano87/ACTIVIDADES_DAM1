package dam1.prog.ejercicios01;

import java.util.Scanner;

public class ComparaNumeros {

	public static void main(String[] args) {

		// SE DECLARAN 2 VARIABLES (NUMEROS ENTEROS)
		int numero_a;
		int numero_b;

		Scanner num = new Scanner(System.in);
		// CON LA UTILIDAD SCANNER SE TOMAN DATOS DE ENTRADA, Y SE PIDE AL USUARIO QUE
		// LOS INGRESE
		System.out.println("Ingrese numero a:");
		numero_a = num.nextInt();

		System.out.println("Ingrese numero b:");
		numero_b = num.nextInt();

		if (numero_a < numero_b) {
			System.out.println("El numero " + numero_a + " es menor que " + numero_b);
		} // Si el numero a es mayor que b nos lo dice
		else if (numero_a > numero_b) {// Si el numero b es mayor que a nos lo dice
			System.out.println("El numero " + numero_a + " es mayor que " + numero_b);
		} else {
			numero_a = numero_b;
			{ // Si el numero b es igual lo dice
				System.out.println("El numero " + numero_a + " es igual que " + numero_b);
			}
			num.close();
		}

	}
}
