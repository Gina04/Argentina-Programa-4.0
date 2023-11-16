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
  public Boolean tieneMasDislike(Cancion cancion){
    return false;
  }
  public abstract void cambiar(Cancion cancion);

}
