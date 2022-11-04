package dam1.prog.ejercicios07;

public class Mayor2Num {

  public static void main(String[] args) {
    //Unos cuantos casos
    System.out.println(buscarMayor(6, 9));//Segundo mayor que el primero ->  9
    System.out.println(buscarMayor(4, 1));//Primero mayor que el segundo ->  4
    System.out.println(buscarMayor(3, 3));//Los dos iguales              ->  0
    System.out.println(buscarMayor(-3, 5));//Uno es negativo             -> -1
    //Casos con el 0, no están contemplados en el enunciado así que asumo
    //que el 0 cuenta como positivo
    System.out.println(buscarMayor(0, 4));//Uno es 0                     ->  4
    System.out.println(buscarMayor(0, 0));//Los dos son 0                ->  0
  }

  private static int buscarMayor(int num1, int num2) {
    //primero los ordeno de menor a mayor
    if (num1 > num2) {
      int temporal = num1;
      num1 = num2;
      num2 = temporal;
    }
    //comprobamos los casos
    if (num1 < 0) {
      return -1;
    } else if (num1 == num2) {
      return 0;
    } else {
      return num2;
    }
  }
}