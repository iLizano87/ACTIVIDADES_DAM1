package dam1.prog.ejercicios07;

import java.util.Arrays;
import java.util.Scanner;

public class Ordena3Num {

  public static void main(String[] args) {
	int numeroUno;
	int numeroDos;
	int numeroTres;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce 3 numeros: ");//Pedimos 3 numeros
	numeroUno = sc.nextInt();
	numeroDos = sc.nextInt();
	numeroTres = sc.nextInt();
	

    int[] arrayOrdenado = ordenarArray(numeroUno, numeroDos, numeroTres);

    String mensaje = Arrays.toString(arrayOrdenado);

    System.out.println("Array en orden ascendente: " + mensaje);
  }
  /**
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return arrayFIN
	 */
  public static int[] ordenarArray(int num1, int num2, int num3) {
    //Pedimos 3 valores
    int[] arrayFIN = {num1, num2, num3};

    //Se van comparando numeros por pareja para colocar primero inferior y despues superior
 
    for (int Mayor = 0; Mayor < arrayFIN.length - 1; Mayor++) {
//System.out.println("Vuelta "+ (topeSuperior + 1) + " miramos parejas hasta la posición " + (arrayFIN.length - Mayor - 1));

      //arrayFIN.length - Mayor - 1 indica hasta donde llega
      for (int indice1 = 0;
          indice1 < arrayFIN.length - Mayor - 1; indice1++) {

        if (arrayFIN[indice1] > arrayFIN[indice1 + 1]) {
          int temp = arrayFIN[indice1];
          arrayFIN[indice1] = arrayFIN[indice1 + 1];
          arrayFIN[indice1 + 1] = temp;
        }
      }
    }
    return arrayFIN;
  }
}