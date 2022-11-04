package dam1.prog.ejercicios06;

import java.util.Arrays;

public class StringToArray {

  public static void main(String[] args) {
    String cadena = "En un lugar de la Mancha";
    cadena = "cds";
    System.out.println(Arrays.toString(cortarCadena(cadena)));
  }

  public static String[] cortarCadena(String cadena) {
    //Como curiosidad, si contamos los espacios como letras, esto es trivial
    // return cadena.split(""); Nos devuelve un String[] con la cadena troceada

    //Me he basado en el metodo eliminaEspacios de Ejercicios V para
    //limpiar la cadena, lo he modificado para que si no hay espacios
    //devuelva la cadena tal cual y no el mensaje de "No hay espacios".
    cadena = eliminaEspacios(cadena);
    //Ahora que tengo una cadena sin espacios me hago un array de la misma
    //longitud para ir rellenadolo
    String[] arrResultado = new String[cadena.length()];
    //Recorro la cadena metiendo cada letra en una posición del array
    for (int i = 0; i < cadena.length(); i++) {
      arrResultado[i] = cadena.substring(i, i + 1);
    }
    return arrResultado;
  }

  //Esta es parecida a la función que hicimos en los Ejercicios V
  public static String eliminaEspacios(String cadena) {
    String cadenaTransformada = "";
    for (int i = 0; i < cadena.length(); i++) {
      String letra = cadena.substring(i, i + 1);
      //Solo se va quedando con lo que no sean espacios
      if (!letra.equals(" ")) {
        cadenaTransformada = cadenaTransformada.concat(letra);
      }
    }
    return cadenaTransformada;
  }
}