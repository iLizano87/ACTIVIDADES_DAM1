package dam1.prog.ejercicios08;

import java.util.Scanner;

public class PersonaMain {

  public static void main(String[] args) {
    Scanner inputText = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    //Variables para ir recogiendo las entradas del usuario
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;
    //Pedimos los datos de la primera persona
    System.out.println("Introduzca el nombre:");
    nombre = inputText.nextLine();
    System.out.println("Introduzca la edad:");
    edad = inputNumber.nextInt();
    System.out.println("Introduzca el sexo:");
    sexo = inputText.nextLine();
    System.out.println("Introduzca el peso:");
    peso = inputNumber.nextDouble();
    System.out.println("Introduzca la altura:");
    altura = inputNumber.nextDouble();
    Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
    //Creamos la primera persona
    
    
    //Pedimos datos para la segunda persona
    System.out.println("Introduzca el nombre:");
    nombre = inputText.nextLine();
    System.out.println("Introduzca la edad:");
    edad = inputNumber.nextInt();
    System.out.println("Introduzca el sexo:");
    sexo = inputText.nextLine();
    //Creamos la segunda persona
    Persona persona2 = new Persona(nombre, edad, sexo);
    //Creamos la tercera persona
    Persona persona3 = new Persona();
    //Damos valores a los atributos de persona3 con los métodos set
    persona3.setNombre("David");
    persona3.setEdad(12);
    persona3.setSexo("M");
    persona3.setPeso(87.4);
    persona3.setAltura(1.93);
    //Miramos si tienen sobrepeso (he hecho una función auxiliar para no repetirme)
    System.out.println("La persona1 está " + tieneSobrepeso(persona1.calcularIMC()));
    System.out.println("La persona2 está " + tieneSobrepeso(persona2.calcularIMC()));
    System.out.println("La persona3 está " + tieneSobrepeso(persona3.calcularIMC()));
    //Miramos si son mayores de edad
    System.out.println(
        "La persona1 es " + (persona1.esMayorDeEdad() ? "mayor" : "menor") + " de edad"
    );
    System.out.println(
        "La persona2 es " + (persona2.esMayorDeEdad() ? "mayor" : "menor") + " de edad"
    );
    System.out.println(
        "La persona3 es " + (persona3.esMayorDeEdad() ? "mayor" : "menor") + " de edad"
    );
    //Sacamos los datos de cada persona
    System.out.println(persona1.toString());
    System.out.println(persona2.toString());
    System.out.println(persona3.toString());
  }

  private static String tieneSobrepeso(int calcularIMC) {
    if (calcularIMC == 0) {
      return "en el peso ideal";
    } else if (calcularIMC == -1) {
      return "bajo el peso ideal";
    } else {
      return "sobre el peso ideal";
    }
  }
}