package dam1.prog.ejercicios07;

import java.util.Arrays;

public class Array3Impares {

  public static void main(String[] args) {
    //llamo al método y guardo el resultado en un array "losImpares"
    int[] losImpares = buscaImpares(1, 10);
    //Transformo el array, con Arrays.toString, en una cadena con los valores que guarda el array
    String mensaje = Arrays.toString(losImpares);
    //Saco el String por consola
    System.out.println(mensaje);
  }

  public static int[] buscaImpares(int limiteInferior, int limiteSuperior) {
    //En esta variable iré metiendo los impares
    int[] arrayImpares = {};
    //Voy mirando uno a uno los enteros del intervalo entre limiteInferior y limiteSuperior
    //He añadido a la condición del for el que deje de buscar impares si ya ha encontrado
    //los tres primeros.
    for (int i = limiteInferior; i <= limiteSuperior && arrayImpares.length < 3; i++) {
      //Compruebo si el numero actual "i" es impar
      if (i % 2 != 0) {
        //Usando Arrays.copyOf es trivial crear un array nuevo con los datos del
        //antiguo + una nueva posición donde meter el siguiente impar.
        // "arrayImpares = Arrays.copyOf(arrayImpares,arrayImpares.length + 1);"

        //Pero supongamos que queremos hacerlo nosotros.
        //Voy a hacerme abajo una función pushNumber() que recibe un array de enteros
        //y un entero. Y devuelve un array con el entero "concatenado" al final.
        //Así puedo llamarla pasándole el array donde quiero ir metiendo los impares
        //y el número que quiero añadir. Me devolverá un array nuevo con el que
        //sobrescribo arrayImpares (como cuando hacemos x = x + 1 para ir acumulando)
        arrayImpares = pushNumber(arrayImpares, i);
      }
    }
    return arrayImpares;
  }

  //esta es la función auxiliar para ir concatenando números al array
  public static int[] pushNumber(int[] arrayOriginal, int numero) {
    //Nos hacemos un array nuevo que sea una posición más largo que el original
    int[] nuevoArray = new int[arrayOriginal.length + 1];
    //Recorremos el array original copiando sus elementos al nuevo
    //Esto también se puede hacer de forma trivial con System.arraycopy()
    for (int i = 0; i < arrayOriginal.length; i++) {
      nuevoArray[i] = arrayOriginal[i];
    }
    //Añadimos en la última posición del nuevo array el entero
    nuevoArray[nuevoArray.length - 1] = numero;
    return nuevoArray;
  }
}