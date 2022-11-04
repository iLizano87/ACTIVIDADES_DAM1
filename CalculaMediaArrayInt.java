package dam1.prog.ejercicios06;

import java.util.Scanner;

public class CalculaMediaArrayInt {

  public static void main(String[] args) {
      int i;
      int[] numeros = new int[5];

      Scanner teclado = new Scanner(System.in);

      for(i=0; i<numeros.length; i++)
      {
          System.out.printf("Introduzca número %d: ", i+1);
          numeros[i] = teclado.nextInt();
      }

      for(i=0; i<numeros.length; i++)
      {
          System.out.println(numeros[i]);
      }
    System.out.println(hacerMedia(numeros));
  }
  public static double hacerMedia(int[] arrEnteros) {
    //Miro que no sea un array vacío
    if (arrEnteros.length > 0) {
      double sumaTotal = 0;
      //Recorro el array acumulando los valores de sus elementos
      for (int i = 0; i < arrEnteros.length; i++) {
        sumaTotal += arrEnteros[i];
      }
      //Devuelvo la suma de los valores entre el número de elementos del array
      return sumaTotal / arrEnteros.length;
    } else {
      //Si el array estaba vacío devuelvo 0
      return 0;
    }
  }
}