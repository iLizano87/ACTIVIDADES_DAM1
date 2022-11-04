package dam1.prog.ejercicios09;

import java.util.ArrayList;

public class Alumno {

  private String dni;
  private String nombre;
  private double notaMedia;
  private ArrayList<Asignatura> asignaturas;


  public Alumno() {
    this("", "");
  }

  public Alumno(String dni, String nombre) {
    this(dni, nombre, 0, new ArrayList<>());
  }

  public Alumno(String dni, String nombre, double notaMedia,
      ArrayList<Asignatura> asignaturas) {
    this.dni = dni;
    this.nombre = nombre;
    this.notaMedia = notaMedia;
    this.asignaturas = asignaturas;
  }

  public void calcularNotaMedia() {
    for (int i = 0; i < asignaturas.size(); i++) {
      notaMedia += asignaturas.get(i).getNota();
    }
    notaMedia /= asignaturas.size();
  }

  public Asignatura getMaxNota() {
    Asignatura max = new Asignatura("", 0);
    for (int i = 0; i < asignaturas.size(); i++) {
      if (asignaturas.get(i).getNota() > max.getNota()) {
        max = asignaturas.get(i);
      }
    }
    return max;
  }

  public Asignatura getMinNota() {
    Asignatura min = new Asignatura("", 10);
    for (int i = 0; i < asignaturas.size(); i++) {
      if (asignaturas.get(i).getNota() < min.getNota()) {
        min = asignaturas.get(i);
      }
    }
    return min;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getNotaMedia() {
    return notaMedia;
  }

  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }

  public ArrayList<Asignatura> getAsignaturas() {
    return asignaturas;
  }

  public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
    this.asignaturas = asignaturas;
  }
}