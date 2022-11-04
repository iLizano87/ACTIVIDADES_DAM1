package dam1.prog.ejercicios05;

import java.util.Scanner;

public class Iniciales {

	/**
	 * @param s
	 * @return caracter0
	 */
    public static Character letra(String s)
    {
        if(s == null || s.length() == 0)
            return null;
        else
            return (Character) s.charAt(0);
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre: ");
		String nombre = sc.next();
		System.out.println("Introduce apellido 1: ");
		String apellido1 = sc.next();
		System.out.println("Introduce apellido 2: ");
		String apellido2 = sc.next();
        System.out.print("Iniciales: "+ letra(nombre)+" "+letra(apellido1)+" "+letra(apellido2));
    }
}