public class Normal extends Popularidad{
  public String getNombre() {
    return nombre;
  }

  String nombre = "Normal";

  @Override
  public Icono icono() {
    return ico.MUSICAL_NOTE;
  }

  @Override
  public String leyenda(Cancion unaCancion) {
    return unaCancion.nombredelArtista+ "-" + unaCancion.anioDelAlbum + "-" +unaCancion.títuloDeLaCanción;
  }

  @Override
  public Boolean cumpleCondicion(Cancion cancion) {
    return cancion.getCantidadReproducciones() > 1000;


  }
  // Implementación del método para cambiar la popularidad de la canción
  @Override
  public Popularidad cambiar(Cancion cancion) {
    if(this.cumpleCondicion(cancion))new EnAuge();

    return this;
  }
}
