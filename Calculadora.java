package dam1.prog.ejercicios08;

public class Calculadora {

	int operador1;
	int operador2;

	public Calculadora() {
	}

	public  Calculadora(int operador1, int operador2) {
		this.operador1=operador1;
		this.operador2=operador2;
	}

	public int sumar() {
		return operador1 + operador2;
	}

	public int resta() {
		return operador1 - operador2;
	}

	public int multiplicacion() {
		return operador1 * operador2;
	}

	public int division() {
		if (operador2 != 0) {
			return operador1 / operador2;
		} else {
			System.out.println("No se puede dividir por 0");
			return 0;
		}

	}
}