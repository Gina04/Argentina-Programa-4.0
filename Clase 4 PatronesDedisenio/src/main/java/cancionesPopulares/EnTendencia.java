package cancionesPopulares;

import cancionesPopulares.Cancion;
import cancionesPopulares.Icono;
import cancionesPopulares.Normal;
import cancionesPopulares.Popularidad;

public class EnTendencia extends Popularidad {
  public String getNombre() {
    return nombre;
  }

  String nombre = "Tendencia";

  @Override
  public Icono icono() {
    return ico.FIRE;
  }

  @Override
  public String leyenda(Cancion unaCancion) {
    return unaCancion.títuloDeLaCanción + "-" + unaCancion.nombredelArtista+ "(" + unaCancion.nombreDelAlbum + unaCancion.anioDelAlbum+ ")";
  }

  @Override
  public  Boolean cumpleCondicion(Cancion cancion){
    return cancion.getHorasReproduccion() <= 1;

  }

  @Override
  public void cambiar(Cancion cancion) {
    if(this.cumpleCondicion(cancion)){
      cancion.cambiarPopu(new Normal());
    }
  }
}
