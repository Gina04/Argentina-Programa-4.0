public class Inscripcion {
  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Materia getMateria() {
    return materia;
  }

  public void setMateria(Materia materia) {
    this.materia = materia;
  }

  public Inscripcion(Alumno alumno, Materia materia) {
    this.alumno = alumno;
    this.materia = materia;
  }

  Alumno alumno;
  Materia materia;
  public boolean aprobada() {
    boolean aproboTodasCorrelativas = materia.getMateriasCorrelativas().stream()
      .allMatch(correlativa -> alumno.tieneMateriaAprobadada(correlativa));
    return aproboTodasCorrelativas;
  }
}
