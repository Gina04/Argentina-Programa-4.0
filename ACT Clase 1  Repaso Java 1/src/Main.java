import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Definir diferentes materias y sus correlativas
    Materia algoritmosYEstructuraDeDatos = new Materia("Algoritmos y Estructuras de Datos");
    Materia paradigmasDeProgramacion = new Materia("Paradigmas de programacion");
    Materia disenioSistemas = new Materia("Diseño de sistemas", new ArrayList<>());
    ArrayList<Materia> correlativasDiseñoDeSistemas = new ArrayList<>();
    correlativasDiseñoDeSistemas.add(algoritmosYEstructuraDeDatos);
    correlativasDiseñoDeSistemas.add(paradigmasDeProgramacion);

    // Crear una materia principal con sus correlativas
    Materia diseñoDeSistemas = new Materia( "Diseño de Sistemas", correlativasDiseñoDeSistemas);

    // Definir las materias aprobadas por el alumno
    ArrayList<Materia>materiasApro = new ArrayList<>();
    materiasApro.add(algoritmosYEstructuraDeDatos);
    materiasApro.add(paradigmasDeProgramacion);
    // Crear un alumno con las materias aprobadas
    Alumno gina=  new Alumno("Gina", 15578180, materiasApro);

    // Crear una inscripción para el alumno en una materia
    Inscripcion unaMateria= new Inscripcion(gina, diseñoDeSistemas);

    // Imprimir si la inscripción fue aprobada
    if(!unaMateria.aprobada()){
      System.out.print("Ustd no cumple con el régimen de correlativas!");
    }else{
      System.out.print("Su inscripción ya fue controlada y cumple con el régimen de correlativas!");
    }


    /*for (Materia mat: gina.getMateriasAprobadas()){

      System.out.print(mat.getNombreMateria()+ ",");
    }


    System.out.print("Correlativas de Diseño de sistemas  " );

    for (Materia corr: diseñoDeSistemas.getMateriasCorrelativas()){

      System.out.print(corr.getNombreMateria()+ ",");
    }
    */

    /*System.out.println("Nombre de la materia: " + diseñoDeSistemas.getNombreMateria());
    System.out.println("Materias correlativas:");
    for (String materia : correlativasDiseñoDeSistemas) {
      System.out.println(materia);*/

    }
  }

