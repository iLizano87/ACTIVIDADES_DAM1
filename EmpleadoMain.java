package dam1.prog.ejercicios09;

public class EmpleadoMain {

  public static void main(String[] args) {
    Empleado[] arrEmpleados = new Empleado[3];

    // En clase llamamos a los métodos setter uno a uno tal que así":
    // arrEmpleados[0] = new Empleado();
    // arrEmpleados[0].setNombre("Adam");
    // arrEmpleados[0].setSueldoBase(12345.54);
    // arrEmpleados[0].setHorasExtras(0);
    // Pero Ojo que esto usa method chaining y no lo hemos visto en clase https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/
    arrEmpleados[0] = new Empleado("11111111A").setNombre("Adam").setSueldoBase(12345.54)
        .setHorasExtras(0);
    arrEmpleados[1] = new Empleado("22222222B").setNombre("Betty").setSueldoBase(65345.54)
        .setHorasExtras(1);
    arrEmpleados[2] = new Empleado("33333333C").setNombre("Claire").setSueldoBase(11345.54)
        .setHorasExtras(2);

    Empleado.setPrecioHoraExtra(23.69);

    Empleado cobraMas = arrEmpleados[0];
    Empleado cobraMenos = arrEmpleados[0];
    Empleado cobraMasExtra = arrEmpleados[0];
    Empleado cobraMenosExtra = arrEmpleados[0];

    for (int i = 1; i < arrEmpleados.length; i++) {
      if (cobraMas.calcularSueldoBruto() < arrEmpleados[i].calcularSueldoBruto()) {
        cobraMas = arrEmpleados[i];
      }
      if (cobraMenos.calcularSueldoBruto() > arrEmpleados[i].calcularSueldoBruto()) {
        cobraMenos = arrEmpleados[i];
      }
      if (cobraMasExtra.calcularComplemento() < arrEmpleados[i].calcularComplemento()) {
        cobraMasExtra = arrEmpleados[i];
      }
      if (cobraMenosExtra.calcularComplemento() > arrEmpleados[i].calcularComplemento()) {
        cobraMenosExtra = arrEmpleados[i];
      }
    }
    //Como hemos sobreescrito toString() no hace falta llamarlo :D
    System.out.println(cobraMas);
    System.out.println(cobraMenos);
    System.out.println(cobraMasExtra);
    System.out.println(cobraMenosExtra);

  }
}