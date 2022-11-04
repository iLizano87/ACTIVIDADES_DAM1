package dam1.prog.ejercicios02;

import java.util.Scanner;

public class MesDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes;

		Scanner num = new Scanner(System.in);

		System.out.println("Elige un mes: ");

		mes = num.nextInt();
//Segun el selector nos muestra el mes, si no da error y pide numero del 1 al 12

		while (mes < 1 || mes > 12) {
			System.err.println("Introduzca el mes entre 1 y 12: ");
			mes = num.nextInt();
		}
		if (mes == 1) {
			System.out.println("ENERO 31 DÍAS");
		} else if (mes == 2) {
			System.out.println("FEBRERO 28 DÍAS");
		} else if (mes == 3) {
			System.out.println("MARZO 31 DÍAS");
		} else if (mes == 4) {
			System.out.println("ABRIL 30 DÍAS");
		} else if (mes == 5) {
			System.out.println("MAYO 31 DÍAS");
		} else if (mes == 6) {
			System.out.println("JUNIO 30 DÍAS");
		} else if (mes == 7) {
			System.out.println("JULIO 31 DÍAS");
		} else if (mes == 8) {
			System.out.println("AGOSTO 31 DÍAS");
		} else if (mes == 9) {
			System.out.println("SEPTIEMBRE 30 DÍAS");
		} else if (mes == 10) {
			System.out.println("OCTUBRE 31 DÍAS");
		} else if (mes == 11) {
			System.out.println("NOVIEMBRE 30 DÍAS");
		} else if (mes == 12) {
			System.out.println("DICIEMBRE 31 DÍAS");
		}
		num.close();
	}
}
