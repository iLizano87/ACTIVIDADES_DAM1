package dam1.prog.ejercicios04;

import java.util.Scanner;

public class TablaMultiplicar {
	    public static void main(String[] args) {
	        int n1; // La tabla del numero que queramos
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Introduce número: ");
	        n1=sc.nextInt();
	        mostrarTabla(n1);//Muestra tabla
	    }
	    /**
		 * @param num
		 * @return imprime desde funcion 
		 */
	    public static void mostrarTabla(int num) {
	        for (int x = 1; x <= 10; x++) {
	            System.out.println(num+" x "+x+" = "+num*x);
	            
	        }
	    }
	}

