package dam1.prog.ejercicios07;

import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {
		int dni;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dni: ");//Pedimos DNI
		dni = sc.nextInt();
		System.out.println("Tu nif es "+dni+letraDNI(dni));
	}
	/**
	 * @param numero
	 * @return letradni
	 */
		public static String letraDNI(int numero) {
			String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K"};
			int dniletra = numero%23;
			String letrafin = letra[dniletra];
			return letrafin;

	}

}
