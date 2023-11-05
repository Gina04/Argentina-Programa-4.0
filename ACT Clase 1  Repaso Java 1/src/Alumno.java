import java.util.ArrayList;

public class Alumno {

  String nombre;
  int legajo;

  ArrayList<Materia> materiasAprobadas = new ArrayList<>();

  public Alumno(String nombre, int legajo, ArrayList<Materia> materiasAprobadas) {
    this.nombre = nombre;
    this.legajo = legajo;
    this.materiasAprobadas = materiasAprobadas;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getLegajo() {
    return legajo;
  }

  public void setLegajo(int legajo) {
    this.legajo = legajo;
  }

  public ArrayList<Materia> getMateriasAprobadas() {
    return materiasAprobadas;
  }

  public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
    this.materiasAprobadas = materiasAprobadas;
  }



  public Boolean tieneMateriaAprobadada(Materia unaMateria){
    return materiasAprobadas.contains(unaMateria);
  }

  /*public String inscribirme(Materia unaMateria){
    if(!materia.aprobada()){
      return "Lo sentimos ustd no tiene todas las correlativas aprobadas";
    }else{
      return "Inscripcion exitosa";
    }

  }*/
}
