package dam1.prog.ejercicios06;

public class BuscarCadena {

  public static final String TEXTO =
      "Desarrolla una función que, dado un texto y una cadena, nos diga si aparece o no esa cadena dentro del texto.\n"
          + "Prueba dicha función desde el main de tu programa.\n"
          + "* Podéis almacenar un texto fijo en una constante o una variable global para solo pedir la cadena a buscar en dicho texto.";

  public static void main(String[] args) {

    String cadenaBuscada = "text";
    // 1. Parte

//    Con contains sería trivial, así que he hecho la función para que al contrario que
//    String.contains() al recibir una cadena "" devuelva false
//    if (cadenaBuscada.length() > 0 && TEXTO.contains(cadenaBuscada)) {
//      System.out.println("La cadena '" + cadenaBuscada + "' aparece en el texto");
//    } else {
//      System.out.println("La cadena '" + cadenaBuscada + "' no aparece en el texto");
//    }

    if (estaLaCadena(cadenaBuscada)) {
      System.out.println("La cadena '" + cadenaBuscada + "' aparece en el texto");
    } else {
      System.out.println("La cadena '" + cadenaBuscada + "' no aparece en el texto");
    }

    // 2. Parte
    System.out.println(
        "La cadena '" + cadenaBuscada + "' aparece " + cuentaApariciones(cadenaBuscada)
            + " veces.");
  }

  // 1. Parte
  public static boolean estaLaCadena(String cadena) {
    //Miramos si la cadena no esta vacía
    if (cadena.length() > 0) {
      //Vamos recorriendo TEXTO hasta que no queden suficientes letras para componer la cadena buscada.
      //Cuidado que si no podríamos tener problemas Out Of Bonds Exception!
      for (int i = 0; i <= TEXTO.length() - cadena.length(); i++) {
        //Si aparece la primera letra de cadena
        if (TEXTO.substring(i, i + 1).equals(cadena.substring(0, 1))) {
          //comprobamos si tenemos toda la cadena buscada
          if (cadena.equals(TEXTO.substring(i, i + cadena.length()))) {
            return true;
          }
        }
      }
    }
    return false;
  }

  // 2. Parte
  public static int cuentaApariciones(String cadena) {
    int contador = 0;
    //Miramos si la cadena no esta vacía
    if (cadena.length() > 0) {
      //Vamos recorriendo TEXTO hasta que no queden suficientes letras para componer la cadena buscada.
      //Cuidado que si no podríamos tener problemas Out Of Bonds Exception!
      for (int i = 0; i <= TEXTO.length() - cadena.length(); i++) {
        //Si aparece la primera letra de cadena
        if (TEXTO.substring(i, i + 1).equals(cadena.substring(0, 1))) {
          //comprobamos si tenemos toda la cadena buscada
          if (cadena.equals(TEXTO.substring(i, i + cadena.length()))) {
            //Incrementamos el contador de veces que aparece
            contador++;
          }
        }
      }
    }
    return contador;
  }
}
