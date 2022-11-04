package dam1.prog.ejercicios08;

public class contador {

	int numero;

	public contador() {

	}

	public contador(int inicio) {
		if (inicio > 0) {
			numero = inicio;
		}
	}

	public void incrementar() {
		numero++;
	}

	public void decrementar() {
		if (numero > 0) {
			numero--;
		}
	}
}
