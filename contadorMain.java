package dam1.prog.ejercicios08;

public class contadorMain {

	public static void main(String[] args) {
		contador contador1 = new contador();//Constructor sin valor
		contador contador2 = new contador(5);//parametro positivo
		contador contador3 = new contador(-4);//parametro negativo
		//Imprimimos por pantalla valores 
		System.out.println("Valor sin parametro= "+contador1.numero);//da 0 (null)
		System.out.println("PARAMETRO= "+contador2.numero);//5
		System.out.println("PARAMETRO NEGATIVO-4= "+contador3.numero);//0 al ser negativo
		//Decremento -- de valores
		contador1.decrementar();
		contador2.decrementar();
		contador3.decrementar();
		//Imprimimos por pantalla valores 
		System.out.println("DECREMENTO:");
		System.out.println("Valor sin parametro con decremento= "+contador1.numero);//da 0
		System.out.println("PARAMETRO 5--= "+contador2.numero);//da 4 -> 5-- 
		System.out.println("PARAMETRO NEGATIVO-4=0= "+contador3.numero);//da 0 al ser negativo
		//Incremento ++ de valores
		contador1.incrementar();
		contador2.incrementar();
		contador3.incrementar();
		//Imprimimos por pantalla valores 
		System.out.println("INCREMENTO (SOBRE ANTERIOR DECREMENTO):");
		System.out.println("Valor sin parametro con incremento sobre decremento= "+contador1.numero);//al ser 0 e incrementar =1
		System.out.println("PARAMETRO 4++= "+contador2.numero);//da 5 al incrementar el decremento (4++)
		System.out.println("PARAMETRO NEGATIVO-4=0++= "+contador3.numero);// al ser 0 por negativo e incrementar=1
		//Incremento ++ de valores
		contador1.incrementar();
		contador2.incrementar();
		contador3.incrementar();
		//Imprimimos por pantalla valores 
		System.out.println("INCREMENTO SOBRE INCREMENTO:");
		System.out.println("Valor sin parametro con incremento sobre incremento=1++= "+contador1.numero);//al ser 1 el anterior e incrementar =2
		System.out.println("PARAMETRO 5++= "+contador2.numero);//da 6 al incrementar el anterior
		System.out.println("PARAMETRO NEGATIVO-4=0++=1++= "+contador3.numero);//al ser 1 el anterior e incrementar =2
	}

}
