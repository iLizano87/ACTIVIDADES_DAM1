package dam1.prog.ejercicios04;

import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce algo: ");//Pedimos al usuario que introduzca palabra
		String palabra = sc.next();
		System.out.println("Has introducido: "+palabra);
		String reverseStr = vuelta(palabra, palabra.length() - 1);
		System.out.println(palabra+" al revés es: "+reverseStr);
	}
	/**
	 * @param palabra
	 * @param principal
	 * @return vuelta
	 */
	static String vuelta(String palabra, int principal) {
		if (principal == 0) {
			return palabra.charAt(0) + "";
		}
		char letter = palabra.charAt(principal);
		return letter + vuelta(palabra, principal - 1);
	}
}
