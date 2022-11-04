
package dam1.prog.ejercicios05;

import java.util.Scanner;

public class MayusMinus {
	/**
	 * @param palabra
	 * @return palabraminus
	 */
	public static void minus(String palabra) {
		Scanner sc = new Scanner(System.in);
		String palabraMAYUS = sc.next();
		System.out.println(palabraMAYUS.toUpperCase());
	}
	/**
	 * @param palabra
	 * @return palabraMAYUS
	 */
	public static void mayus(String palabra) {
		Scanner sc = new Scanner(System.in);
		String palabraminus = sc.next();
		System.out.println(palabraminus.toLowerCase());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce opción");//Pedimos al usuario que elija
		System.out.println("1 - de minus a MAYUS");
		System.out.println("2 - de MAYUS a minus");
		int eleccion = sc.nextInt();
		if (eleccion == 1) {
		//Eleccion 1 = Introduce palabra
			System.out.println("Introduce palabra: ");
			String palabra = null;
			minus(palabra);//retorna resultado de minus a MAYUS
		}
		else if(eleccion == 2) {
		//Eleccion 2 = Introduce palabra
			System.out.println("Introduce palabra: ");
			String palabra2 = null;
			mayus(palabra2);//retorna resultado de MAYUS a minus
		}
		else {
		//Si no es 1 ni 2 muestra error
			System.err.println("Tenias que haber introducido 1 ó 2");
			
		}
		}
	}
