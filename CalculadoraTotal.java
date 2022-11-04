package dam1.prog.ejercicios03;

import java.util.Scanner;

public class CalculadoraTotal {

	public static void main(String[] args) {
		String uno = "1 - SUMAR";
		String dos = "2 - RESTAR";
		String tres = "3 - MULTIPLICAR";
		String cuatro = "4 - DIVIDIR";
		String cero = "0 - SALIR";
		int eleccion;

		Scanner elec = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {

			System.out.println(uno);
			System.out.println(dos);
			System.out.println(tres);
			System.out.println(cuatro);
			System.out.println(cero);
			System.out.println("ESCOGE UNA OPCIÓN:");
			eleccion = elec.nextInt();

			switch (eleccion) {
			case 1:
				System.out.println("HA ELEGIDO SUMAR");
				// SE DECLARAN TRES VARIABLES (NUMEROS ENTEROS)
				float numero_a;
				float numero_b;
				float resultado;

				Scanner suma = new Scanner(System.in);
				// CON LA UTILIDAD SCANNER SE TOMAN DATOS DE ENTRADA, Y SE PIDE AL USUARIO QUE
				// LOS INGRESE
				System.out.println("Ingrese número a:");
				numero_a = suma.nextFloat();

				System.out.println("Ingrese número b:");
				numero_b = suma.nextFloat();
				// SE REALIZA LA OPERACION PARA SUMAR LOS DOS NUMEROS INTRODUCIDOS
				resultado = numero_a + numero_b;
				// SE MUESTRA EL RESULTADO
				System.out.println("El resultado es:" + resultado);
				break;
			case 2:
				System.out.println("HA ELEGIDO RESTAR");
				// SE DECLARAN TRES VARIABLES (NUMEROS ENTEROS)
				float numero_c;
				float numero_d;
				float resultado2;

				Scanner resta = new Scanner(System.in);
				// CON LA UTILIDAD SCANNER SE TOMAN DATOS DE ENTRADA, Y SE PIDE AL USUARIO QUE
				// LOS INGRESE
				System.out.println("Ingrese número a:");
				numero_c = resta.nextFloat();

				System.out.println("Ingrese número b:");
				numero_d = resta.nextFloat();
				// SE REALIZA LA OPERACION PARA RESTAR LOS DOS NUMEROS INTRODUCIDOS
				resultado2 = numero_c - numero_d;
				// SE MUESTRA EL RESULTADO
				System.out.println("El resultado es:" + resultado2);
				break;
			case 3:
				System.out.println("HA ELEGIDO MULTIPLICAR");
				// SE DECLARAN TRES VARIABLES (NUMEROS ENTEROS)
				float numero_e;
				float numero_f;
				float resultado3;

				Scanner multiplicacion = new Scanner(System.in);
				// CON LA UTILIDAD SCANNER SE TOMAN DATOS DE ENTRADA, Y SE PIDE AL USUARIO QUE
				// LOS INGRESE
				System.out.println("Ingrese número a:");
				numero_e = multiplicacion.nextFloat();

				System.out.println("Ingrese número b:");
				numero_f = multiplicacion.nextFloat();
				// SE REALIZA LA OPERACION PARA MULTIPLICAR LOS DOS NUMEROS INTRODUCIDOS
				resultado3 = numero_e * numero_f;
				// SE MUESTRA EL RESULTADO
				System.out.println("El resultado es:" + resultado3);
				break;
			case 4:
				System.out.println("HA ELEGIDO DIVIDIR");
				// SE DECLARAN TRES VARIABLES (NUMEROS ENTEROS)
				float numero_g;
				float numero_h;
				float resultado4;

				Scanner division = new Scanner(System.in);
				// CON LA UTILIDAD SCANNER SE TOMAN DATOS DE ENTRADA, Y SE PIDE AL USUARIO QUE
				// LOS INGRESE
				System.out.println("Ingrese número a:");
				numero_g = division.nextFloat();

				System.out.println("Ingrese número b:");
				numero_h = division.nextFloat();
				// SE REALIZA LA OPERACION PARA DIVIDIR LOS DOS NUMEROS INTRODUCIDOS
				resultado4 = numero_g / numero_h;
				// SE MUESTRA EL RESULTADO
				System.out.println("El resultado es:" + resultado4);
				break;
			case 0:
				salir = true;
				break;
			default:
				System.err.println("Introduce un número del 0 al 4:");
				break;
			}
		}
	}
}
