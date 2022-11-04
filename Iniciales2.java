package dam1.prog.ejercicios05;

import java.util.Scanner;

public class Iniciales2 {

	/**
	 * @param nombreapellidos
	 * @return partido[i] //Primera letra de cada palabra
	 */
	public static char letra (String nombreapellidos) {  
        String[] partido = nombreapellidos.toLowerCase().split(" ");        
        for (int i = 0; i < partido.length; i++) {
            System.out.println(partido[i].toUpperCase().charAt(0));
        }
		char i = 0;
		return (partido[i].toUpperCase().charAt(0));}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre y apellidos: ");
		String nombre = sc.nextLine();
		System.out.print("Iniciales: " + letra(nombre));

	}

}
