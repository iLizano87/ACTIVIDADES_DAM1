package dam1.prog.ejercicios07;

import java.util.Arrays;

public class SeparaPalabras {

  public static void main(String[] args) {
    
	String frase = "En un lugar de la Mancha";
    System.out.println(Arrays.toString(separarPalabras(frase)));
  }

  public static String[] separarPalabras(String frase) {
    //Array vacío para almacenar las palabras
    String[] arraySinEspacios = {};
    //Una cadena vacía para ir creando cada palabra concatenando letras
    String sinEspacio = "";
    //Vamos recorriendo la frase
    for (int i = 0; i < frase.length(); i++) {
      //Cogemos una letra cada vez
      String espacio = frase.substring(i, i + 1);
      //Miramos si es un espacio
      if (espacio.equals(" ")) {
        //Añadimos la palabra al final del array
        arraySinEspacios = push(arraySinEspacios, sinEspacio);
        //Vaciamos la palabra
        sinEspacio = "";
      } else {
        //Concatenamos la letra al array palabra, lo mismo que "palabra += letra"
        sinEspacio = sinEspacio.concat(espacio);
      }
    }
    return arraySinEspacios;
  }
  /**
 	 * @param String
 	 * @return nuevoArray
 	 */
  //Este método es como el de pushNumber de Array3Impares, pero para Strings[]
  public static String[] push(String[] arrayOriginal, String palabra) {
    //Nos hacemos un array nuevo que sea una posición más largo que el original
    String[] nuevoArray = new String[arrayOriginal.length + 1];
    //Recorremos el array original copiando sus elementos al nuevo
    for (int i = 0; i < arrayOriginal.length; i++) {
      nuevoArray[i] = arrayOriginal[i];
    }
    //Añadimos en la última posición del nuevo array la nueva cadena
    nuevoArray[nuevoArray.length - 1] = palabra;
    return nuevoArray;
  }
}