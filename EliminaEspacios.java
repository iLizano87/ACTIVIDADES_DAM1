package dam1.prog.ejercicios05;

import java.util.Scanner;

public class EliminaEspacios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce algo: ");//Pedimos string
		String cadena = sc.nextLine();
	    System.out.println(cadena);
	    System.out.println(eliminaEspacios(cadena));
	  }
	/**
	 * @param cadena
	 * @return cadenaTransformada
	 */
	  public static String eliminaEspacios(String cadena) {
	    String sinEspacios = "";
	    if (cadena.indexOf(" ") == -1) {
	      sinEspacios = "es sin espacios";
	    } else {
	      for (int i = 0; i < cadena.length(); i++) {
	        String letra = cadena.substring(i, i + 1);
	        if (!letra.equals(" ")) {
	          sinEspacios = sinEspacios.formatted(sinEspacios);
	        }
	      }
	    }
	    return sinEspacios;
	  }
	}

