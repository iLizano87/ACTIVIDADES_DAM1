package dam1.prog.ejercicios08;

public class LibroMain {

  public static void main(String[] args) {
    //Constructor por defecto
    Libro libro1 = new Libro();
    Libro libro2 = new Libro();

    //Inicializamos los valores con los métodos set
    libro1.setTitulo("Caballo de Troya");
    libro1.setAutor("JJ Benitez");
    libro1.setNumTotal(2);
    libro1.setNumDisponible(1);
    
    System.out.println("Título: " + libro1.getTitulo());
    System.out.println("Autor: " + libro1.getAutor());
    System.out.println("Libros en propiedad: " + libro1.getNumTotal());
    System.out.println("Libros disponibles para préstamo: " + libro1.getNumDisponible());
    System.out.println("------------PRESTAMO---------------");
  //Prestamos el libro1
    System.out.println("Hay " + libro1.getNumDisponible() + " libros disponibles");
    boolean prestar = libro1.prestamo();
    if(prestar){
      System.out.println("Hay disponibilidad de este libro");
    }else {
      System.out.println("No hay disponibilidad");
    }
    System.out.println("-------------------------------------");
    libro2.setTitulo("Sangre,Sudor y Pixeles");
    libro2.setAutor("Jason Schreier ");
    libro2.setNumTotal(4);
    libro2.setNumDisponible(0);

    //Metodo get
    System.out.println("Título: " + libro2.getTitulo());
    System.out.println("Autor: " + libro2.getAutor());
    System.out.println("Libros en propiedad: " + libro2.getNumTotal());
    System.out.println("Libros disponibles para préstamo: " + libro2.getNumDisponible());
    System.out.println("------------PRESTAMO---------------");
    //Prestamos el libro2
    System.out.println("Hay " + libro2.getNumDisponible() + " libros disponibles");
    boolean prestar1 = libro2.prestamo();
    if(prestar1){
      System.out.println("Hay disponibilidad de este libro");
    }else {
      System.out.println("No hay disponibilidad");
    }
    System.out.println("Hay " + libro2.getNumDisponible() + " libros disponibles");
    //No había disponibles, así que voy a devolver uno
    boolean devolver = libro2.devolucion();
    if(devolver){
      System.out.println("Devolución correcta");
    }else {
      System.out.println("Todos devueltos");
    }
    //Ahora sí que hay libros disponibles
    System.out.println("Hay " + libro2.getNumDisponible() + " libros disponibles");
    //Voy a tomarlo en préstamo
    prestar1 = libro2.prestamo();
    if(prestar1){
      System.out.println("Hay disponibilidad de este libro");
    }else {
      System.out.println("No hay disponibilidad");
    }
    }
  }
