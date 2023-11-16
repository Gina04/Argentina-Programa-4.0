package cancionesPopulares;

public abstract class Popularidad {
  String nombre;
  Icono ico;

  public String getNombre() {
    return nombre;
  }

  public String mostrarDetalle(Cancion unaCancion){
    return this.leyenda(unaCancion) + this.icono();
  }

  // Métodos abstractos que deben ser implementados por las clases hijas
  public abstract Icono icono();
  public abstract String leyenda(Cancion unaCancion);
  public abstract Boolean cumpleCondicion(Cancion cancion);
  //Aca siempre va hacer falso para la pupularidad Normal y En Tendencia, solo se va a sobre
  //escribir el metodo en EnAuge (en caso de que que se cumpla criterio)
  public Boolean cumpleMasDislike(Cancion cancion){
    return false;
  }
  public abstract Popularidad cambiar();

}
