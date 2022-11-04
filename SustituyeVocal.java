package dam1.prog.ejercicios06;

import java.util.Scanner;

public class SustituyeVocal {

	  public static void main(String[] args) {
	    // 1a Versión
	    String cadena = "En un lugar de la Mancha";
	    
	    System.out.println(sustituirVocal(cadena));

	  }

	  public static String sustituirVocal(String cadena) {
//	    String cadenaTransformada = "";
//	    for (int i = 0; i < cadena.length(); i++) {
//	      String letra = cadena.substring(i, i + 1);
//	      if (letra.equals("a")) {
//	        cadenaTransformada = cadenaTransformada.concat("e");
//	      } else {
//	        cadenaTransformada = cadenaTransformada.concat(letra);
//	      }
//	    }
//	    return cadenaTransformada;
//	    Como ahora tenemos una función más general podemos cambiar esta también
	    return sustituirVocal(cadena, "a", "e");
	  }

	  // 2a Versión con función sobrecargada sobrecargada
	  public static String sustituirVocal(String cadena, String vocalAntigua, String vocalNueva) {
	    String cadenaTransformada = ""; // Aquí concateno la cadena transformada
	    String letra;
	    // Miro si las vocales a sustituir no son cadenas vacias
	    if (vocalNueva.length() > 0 && vocalAntigua.length() > 0) {
	      // Genero una nueva cadena transformada a partir de la cadena pasada por parametro
	      for (int i = 0; i < cadena.length(); i++) {
	        // Cojo las letras de la cadena por parametro una a una
	        letra = cadena.substring(i, i + 1);
	        // Miro si hay que sustituir y voy concatenado la nueva cadena
	        if (letra.equals(vocalAntigua)) {
	          cadenaTransformada = cadenaTransformada.concat(vocalNueva);
	        } else {
	          cadenaTransformada = cadenaTransformada.concat(letra);
	        }
	      }
	    } else {
	      // No hay nada que cambiar, así que la cadena devuelta es la misma que se pasó por parametro
	      cadenaTransformada = cadena;
	    }

	    return cadenaTransformada;
	  }

	  // Esta función la he hecho para no tener que repetir tanto el menú de pedir vocales
	  public static String dameUnaVocal(String mensaje) {
	    Scanner input = new Scanner(System.in);
	    System.out.println(mensaje);
	    System.out.println("1. a");
	    System.out.println("2. e");
	    System.out.println("3. i");
	    System.out.println("4. o");
	    System.out.println("5. u");
	    return switch (input.nextInt()) {
	      case 1 -> "a";
	      case 2 -> "e";
	      case 3 -> "i";
	      case 4 -> "o";
	      case 5 -> "u";
	      default -> "";
	    };
	  }
	}