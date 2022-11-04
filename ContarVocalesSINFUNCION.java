package dam1.prog.ejercicios04;

import java.util.Scanner;

public class ContarVocalesSINFUNCION {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce algo: ");
		String str = sc.next();
		int vocalA = 0, vocalE = 0, vocalI = 0, vocalO = 0, vocalU = 0;

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);

			// comprobamos cuantas vocales de cada hay
			if (ch == 'a') {
				++vocalA;
			}			
			else if (ch == 'e') {
				++vocalE;
			}
			else if (ch == 'i') {
				++vocalI;
			}
			else if (ch == 'o') {
				++vocalO;
				
			} else if (ch == 'u') {
				++vocalU;
			}
		}
		System.out.println("Vocal A: " + vocalA);
		System.out.println("Vocal E: " + vocalE);
		System.out.println("Vocal I: " + vocalI);
		System.out.println("Vocal O: " + vocalO);
		System.out.println("Vocal U: " + vocalU);
	}
}