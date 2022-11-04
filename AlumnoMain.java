package dam1.prog.ejercicios09;

import java.util.ArrayList;
import java.util.List;

public class AlumnoMain {

  public static void main(String[] args) {
    //Creamos un arrayList de Alumnos
    ArrayList<Alumno> arrAlumnos = new ArrayList<>();
    //Alumnos para pruebas, y no tener que estar constantemente dando datos por consola

    arrAlumnos.add(new Alumno("","AAAA",0,new ArrayList<>(List.of(
                    new Asignatura("FOL", 1),
                    new Asignatura("LLMM", 1),
                    new Asignatura("BBDD", 1),
                    new Asignatura("SII", 0),
                    new Asignatura("PROG", 1)
                )
            )
        )
    );

    arrAlumnos.add(
        new Alumno(
            "",
            "BBBB",
            0,
            new ArrayList<>(
                List.of(
                    new Asignatura("FOL", 1),
                    new Asignatura("LLMM", 1),
                    new Asignatura("BBDD", 1),
                    new Asignatura("SII", 1),
                    new Asignatura("PROG", 1)
                )
            )
        )
    );

    arrAlumnos.add(
        new Alumno(
            "",
            "CCCC",
            0,
            new ArrayList<>(
                List.of(
                    new Asignatura("FOL", 1),
                    new Asignatura("LLMM", 1),
                    new Asignatura("BBDD", 1),
                    new Asignatura("SII", 1),
                    new Asignatura("PROG", 1)
                )
            )
        )
    );

    arrAlumnos.add(
        new Alumno(
            "",
            "DDDD",
            0,
            new ArrayList<>(
                List.of(
                    new Asignatura("FOL", 1),
                    new Asignatura("LLMM", 1),
                    new Asignatura("BBDD", 2),
                    new Asignatura("SII", 1),
                    new Asignatura("PROG", 1)
                )
            )
        )
    );

    arrAlumnos.add(
        new Alumno(
            "",
            "EEEE",
            0,
            new ArrayList<>(
                List.of(
                    new Asignatura("FOL", 1),
                    new Asignatura("LLMM", 1),
                    new Asignatura("BBDD", 1),
                    new Asignatura("SII", 1),
                    new Asignatura("PROG", 1)
                )
            )
        )
    );

    //Calcular notas medias llamando al método calcularNotaMedia de cada objeto
    for (int i = 0; i < arrAlumnos.size(); i++) {
      arrAlumnos.get(i).calcularNotaMedia();
    }

    Alumno mejorMedia = arrAlumnos.get(0);
    Alumno maxNota = arrAlumnos.get(0);
    Alumno minNota = arrAlumnos.get(0);

    for (int i = 1; i < arrAlumnos.size(); i++) {
      if (mejorMedia.getNotaMedia() < arrAlumnos.get(i).getNotaMedia()) {
        mejorMedia = arrAlumnos.get(i);
      }
      if (maxNota.getMaxNota().getNota() < arrAlumnos.get(i).getMaxNota().getNota()) {
        maxNota = arrAlumnos.get(i);
      }
      if (minNota.getMinNota().getNota() > arrAlumnos.get(i).getMinNota().getNota()) {
        minNota = arrAlumnos.get(i);
      }
    }

    System.out.println("El alumno con mejor media es " + mejorMedia.getNombre());

    System.out.println(
        "El alumno con la nota más alta es " + maxNota.getNombre() + " en la asignatura de "
            + maxNota.getMaxNota().getNombre());

    System.out.println(
        "El alumno con la nota más baja es " + minNota.getNombre() + " en la asignatura de "
            + minNota.getMinNota().getNombre());

  }


}
