package dam1.prog.ejercicios08;

public class CalculadoraMain {

  public static void main(String[] args) {
    Calculadora calc1 = new Calculadora();//Constructor por defecto los operandos son 0 y 0
    Calculadora calc2 = new Calculadora(-8, 9);// -8 y 9
    Calculadora calc3 = new Calculadora(12,0);// 12 y 0
    //suma
    System.out.println(calc1.sumar());//0
    System.out.println(calc2.sumar());//1
    System.out.println(calc3.sumar());//12
    //resta
    System.out.println(calc1.resta());//0
    System.out.println(calc2.resta());//-17
    System.out.println(calc3.resta());//12
    //Multiplicación
    System.out.println(calc1.multiplicacion());//0
    System.out.println(calc2.multiplicacion());//-72
    System.out.println(calc3.multiplicacion());//0
    //División
    System.out.println(calc1.division());//0 No se puede dividir por 0
    System.out.println(calc2.division());//0
    System.out.println(calc3.division());//0 No se puede dividir por 0
  }
}