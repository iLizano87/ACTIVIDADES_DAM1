package dam1.prog.ejercicios09;

public class Ajuste {

  public static void main(String[] args) {

    String[] cadenas = {"Pepe", "59", "hola", "Manolo", "76", "hola", "Baldomero", "102", "hola"};

    imprimeTresCol(cadenas);

  }

  private static void imprimeTresCol(String[] arrCadenas) {
    int longPrimeraCol = 0;
    int longSegundaCol = 0;
    int longTerceraCol = 0;
    int contadorPosicion = 0;

    for (int i = 0; i < arrCadenas.length; i++) {
      if (contadorPosicion == 0) {
        longPrimeraCol = getMax(arrCadenas[i], longPrimeraCol);
        contadorPosicion++;
      } else if (contadorPosicion == 1) {
        longSegundaCol = getMax(arrCadenas[i], longSegundaCol);
        contadorPosicion++;
      } else {
        longTerceraCol = getMax(arrCadenas[i], longTerceraCol);
        contadorPosicion = 0;
      }
    }
    for (int i = 0; i < arrCadenas.length; i += 3) {
      //Con printf

//      System.out.printf("%-" + longitudMax + "s\t%-" + longitudMax + "s\t%-" + longitudMax + "s\n",
//          cadenas[i], cadenas[i + 1], cadenas[i + 2]);

      //Sin usar printf
      System.out.print(padCadena(arrCadenas[i], longPrimeraCol) + "\t");
      System.out.print(padCadena(arrCadenas[i + 1], longSegundaCol) + "\t");
      System.out.print(padCadena(arrCadenas[i + 2], longTerceraCol) + "\n");
    }
  }

  private static String padCadena(String cadena, int longitudMax) {
    for (int i = cadena.length(); i < longitudMax; i++) {
      cadena += " ";
    }
    return cadena;
  }

  private static int getMax(String cadena1, int max) {
    return Math.max(cadena1.length(), max);
  }
}