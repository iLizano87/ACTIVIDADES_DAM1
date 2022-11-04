package dam1.prog.ejercicios09;

public class Empleado {

  private static double precioHoraExtra;

  private String dni;
  private String nombre;
  private double sueldoBase;
  private int horasExtras;

  public Empleado() {

  }

  public Empleado(String dni) {
    this.dni = dni;
  }

  public static double getPrecioHoraExtra() {
    return precioHoraExtra;
  }

  public static void setPrecioHoraExtra(double precioHoraExtra) {
    Empleado.precioHoraExtra = precioHoraExtra;
  }

  //Ojo los setters estÃ¡n alterados para usar method chaining
  public String getDni() {
    return dni;
  }

  public Empleado setDni(String dni) {
    this.dni = dni;
    return this;
  }

  public String getNombre() {
    return nombre;
  }

  public Empleado setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public double getSueldoBase() {
    return sueldoBase;
  }

  public Empleado setSueldoBase(double sueldoBase) {
    this.sueldoBase = sueldoBase;
    return this;
  }

  public int getHorasExtras() {
    return horasExtras;
  }

  public Empleado setHorasExtras(int horasExtras) {
    this.horasExtras = horasExtras;
    return this;
  }

  public double calcularComplemento() {
    return horasExtras * precioHoraExtra;
  }

  public double calcularSueldoBruto() {
    return sueldoBase + calcularComplemento();
  }

  public String toString() {
    return dni + " " + nombre + "\n"
        + "Sueldo base : " + sueldoBase + "\n"
        + "Horas Extras : " + horasExtras;
  }
}