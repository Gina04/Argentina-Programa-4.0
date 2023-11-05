import java.util.ArrayList;

public class Materia {

  public Materia(String nombreMateria, ArrayList<Materia> materiasCorrelativas) {
    this.nombreMateria = nombreMateria;
    this.materiasCorrelativas = materiasCorrelativas;
  }

  String nombreMateria;

  public Materia(String nombreMateria) {
    this.nombreMateria = nombreMateria;
  }

  //Esto se puede hacer?
  ArrayList<Materia> materiasCorrelativas = new ArrayList<>();
  public String getNombreMateria() {
    return nombreMateria;
  }

  public void setNombreMateria(String nombreMateria) {
    this.nombreMateria = nombreMateria;
  }

  public ArrayList<Materia> getMateriasCorrelativas() {
    return materiasCorrelativas;
  }

  public void setMateriasCorrelativas(ArrayList<Materia> materiasCorrelativas) {
    this.materiasCorrelativas = materiasCorrelativas;
  }



   public void agregarCorrelativa(Materia unaMateria){
     materiasCorrelativas.add(unaMateria);
   }




}
