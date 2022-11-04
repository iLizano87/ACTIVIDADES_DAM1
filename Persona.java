package dam1.prog.ejercicios08;

public class Persona {

  private static final int FIGURIN = 0;
  private static final int GORDACO = 1;
  private static final int DELGADUCHO = -1;
  private static final int EDAD_ADULTA = 18;

  private String nombre;
  private int edad;
  private String sexo;
  private double peso;
  private double altura;

  public Persona() {
    nombre = "";
    sexo = "";
    //El resto por defecto se inicializan a 0
  }

  public Persona(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    //El resto por defecto se inicializan a 0
  }

  public Persona(String nombre, int edad, String sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public int calcularIMC() {
    //Ojo caso de ser peso 0, altura 0 nos da un NaN
    double imc = peso / Math.pow(altura, 2);
    if (imc < 20) {
      return DELGADUCHO;
    } else if (imc <= 25) {
      return FIGURIN;
    } else if (imc > 25){
      return GORDACO;
    } else {
      //Caso del NaN
      return DELGADUCHO;
    }
  }

  public boolean esMayorDeEdad() {
    return edad >= EDAD_ADULTA;
  }

  public String toString() {
    return "Nombre: " + nombre + " Edad: " + edad + " Sexo: " + sexo + " Peso: " + peso + "Kg Altura: "
        + altura + "m";
  }
}