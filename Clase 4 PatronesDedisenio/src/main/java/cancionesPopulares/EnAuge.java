package cancionesPopulares;

import cancionesPopulares.Cancion;
import cancionesPopulares.Icono;
import cancionesPopulares.Popularidad;

public class EnAuge extends Popularidad {
  public String getNombre() {
    return nombre;
  }

  String nombre = "auge";


  @Override
  public Icono icono() {
    return ico.ROCKET;
  }

  @Override
  public String leyenda(Cancion unaCancion) {
    return unaCancion.nombredelArtista+ "-" + unaCancion.títuloDeLaCanción + "(" + unaCancion.nombreDelAlbum + unaCancion.anioDelAlbum+ ")";
  }

  @Override
  public Boolean cumpleCondicion(Cancion cancion) {
    return cancion.getCantidadReproducciones() > 50000 && cancion.getLikes()> 20.000;
  }

  public Boolean tieneMasDislike(Cancion cancion){
    return cancion.getDislikes() > 5000;

  }

  @Override
  public void cambiar(Cancion cancion) {
    if(this.cumpleCondicion(cancion)){
      cancion.cambiarPopu(new EnTendencia());
    } else if (this.tieneMasDislike(cancion)) {
      cancion.cambiarPopu(new Normal());
    }
    }

}
