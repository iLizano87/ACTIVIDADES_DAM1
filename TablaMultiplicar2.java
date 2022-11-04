package dam1.prog.ejercicios04;

import java.util.Scanner;

public class TablaMultiplicar2 {
	    public static void main(String[] args) {
	        int n1; // La tabla del numero que queramos
	       
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Introduce número: ");
	        n1=sc.nextInt();
	        mostrarTabla(n1);//Muestra tabla
	    }
	    /**
		 * @param num
		 * @return tabla (imprime en función)
		 */
	    public static void mostrarTabla(int num) {
	    	int rango1;
	    	int rango2;
	    	Scanner sc1 = new Scanner (System.in);
	        System.out.println("Introduce rango N: ");// Primer numero de rango
	    	rango1=sc1.nextInt();
	        System.out.println("Introduce rango M: ");// Segundo numero de rango
	        rango2=sc1.nextInt();
	        for (int x = rango1; x <= rango2; x++) {
	            System.out.println(num+" x "+x+" = "+num*x);
	            
	        }
	    }
	}