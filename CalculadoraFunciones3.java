package dam1.prog.ejercicios03;

import java.util.Scanner;

public class CalculadoraFunciones3 {
//FUNCION SUMA
	public static int suma(int n1, int n2) {
		int resultado;
		resultado = n1 + n2;
		return resultado;
	}

	// FUNCION RESTA
	public static int resta(int n1, int n2) {
		int resultado;
		resultado = n1 - n2;
		return resultado;
	}

	// FUNCION RESTA2
	public static int resta2(int n1, int n2) {
		int resultado;
		resultado = n2 - n1;
		return resultado;
	}

	// FUNCION MULTIPLICACION
	public static int multiplica(int n1, int n2) {
		int resultado;
		resultado = n1 * n2;
		return resultado;
	}

	// FUNCION DIVISION
	public static float divide(float n1, float n2) {
		float resultado;
		resultado = n1 / n2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner introducir = new Scanner(System.in);
		int num1, num2, total, elec;
		float total2;
		boolean salir = false;
		// PEDIMOS LOS DOS NUMEROS
		System.out.println("Introduce primer número: ");
		num1 = introducir.nextInt();
		System.out.println("Introduce segundo número: ");
		num2 = introducir.nextInt();
		// PEDIMOS OPERACION A REALIZAR
		System.out.println("Indica que quieres realizar: ");
		System.out.println("1- Sumar ");
		System.out.println("2- Restar ");
		System.out.println("3- Multiplicar ");
		System.out.println("4- Dividir ");
		System.out.println("0- Salir ");
// MIENTRAS LA OPCION INTRODUCIDA (NUMERO ENTERO) SEA DISTINTA A LO QUE SE PIDA SE SIGUE EJECUTANDO
		while (!salir) {
			elec = introducir.nextInt();

			switch (elec) {
			case 1:
				// NOS DEVUELVE RESULTADO SUMA
				System.out.println("HA ELEGIDO SUMAR");
				total = suma(num1, num2);
				System.out.println("La suma es: " + total);
				break;
			case 2:
				// EN EL CASO DE RESTA, SI EL SEGUNDO ES MAYOR QUE EL PRIMERO, HARA RESTA DEL
				// SEGUNDO POR EL PRIMERO
				System.out.println("HA ELEGIDO RESTAR");
				if (num1 >= num2) {
					total = resta(num1, num2);
					System.out.println("La resta es: " + total);
				} else if (num2 > num1) {
					total = resta2(num1, num2);
					System.out.println(+num2 + " es mayor que " + num1);
					System.out.println("La resta es: " + total);
				}
				break;
			case 3:
				// NOS DEVUELVE RESULTADO MULTIPLICACION
				System.out.println("HA ELEGIDO MULTIPLICAR");
				total = multiplica(num1, num2);
				System.out.println("La multiplicación es: " + total);
				break;
			case 4:
				// NOS DEVUELVE RESULTADO DIVISION
				System.out.println("HA ELEGIDO DIVIDIR");
				total2 = divide(num1, num2);
				System.out.println("La división es: " + total2);
				break;
			case 0:
				// 0 PARA SALIR
				salir = true;
				break;
			default:
				// ERROR SI NO ES UN NUMERO PEDIDO
				System.err.println("Introduce un número del 0 al 4:");
				break;
			}
		}
	}
}
