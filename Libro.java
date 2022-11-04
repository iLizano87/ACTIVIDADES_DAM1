package dam1.prog.ejercicios08;

public class Libro {

	private String Titulo;
	private String Autor;
	private int numTotal;
	private int numDisponible;
	
	public Libro() {
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNumTotal() {
		return numTotal;
	}

	public void setNumTotal(int numTotal) {
		this.numTotal = numTotal;
	}

	public int getNumDisponible() {
		return numDisponible;
	}

	public void setNumDisponible(int numDisponible) {
		this.numDisponible = numDisponible;
	}
	
	public boolean prestamo() {
	    if (numDisponible > 0) {
	      numDisponible--;
	      return true;
	    }
	    return false;
	  }

	  public boolean devolucion() {
	    if (numDisponible < numTotal) {
	      numDisponible++;
	      return true;
	    }
	    return false;
	  }
	}