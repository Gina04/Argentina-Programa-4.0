package cancionesPopulares;

public class Cancion {
  String nombredelArtista;
  String títuloDeLaCanción;

  String nombreDelAlbum;

  int anioDelAlbum;
  int cantidadReproducciones; // 1000 reproducciones
  int dislikes;

  int likes;

  int horasReproduccion; //24hs
  Popularidad tipoPopularidad = new Normal(); // new cancionesPopulares.EnTendencia(); new cancionesPopulares.EnAuge()


  // Método para mostrar detalles de la canción utilizando su tipo de popularidad
  public String mostrarDetalleCancion(){
    return this.tipoPopularidad.mostrarDetalle(this);

  }

  //cambio la popularidad de la cancion, segun si cumple una condicion u otra
  //estas condiciones las manejor en cada tipo de popularidad
  // ya que cada una de ellas las maneja de una manera distinta
  public void cambpop(){
    if(this.getTipoPopularidad().cumpleCondicion(this)){
      this.setTipoPopularidad(this.getTipoPopularidad().cambiar());
    } else if (this.getTipoPopularidad().cumpleMasDislike(this)) { // aca solo voy a chequear cuando este en la popularidad Tendencia
      this.setTipoPopularidad(new Normal()); //tirado de los pelos, esta solucion!!!!!!!!!!!!!!!!!!!!!
    }
  }


  //getters y setters
  public String getNombredelArtista() {
    return nombredelArtista;
  }

  public void setNombredelArtista(String nombredelArtista) {
    this.nombredelArtista = nombredelArtista;
  }

  public String getTítuloDeLaCanción() {
    return títuloDeLaCanción;
  }

  public void setTítuloDeLaCanción(String títuloDeLaCanción) {
    this.títuloDeLaCanción = títuloDeLaCanción;
  }

  public String getNombreDelAlbum() {
    return nombreDelAlbum;
  }

  public void setNombreDelAlbum(String nombreDelAlbum) {
    this.nombreDelAlbum = nombreDelAlbum;
  }

  public int getAnioDelAlbum() {
    return anioDelAlbum;
  }

  public void setAnioDelAlbum(int anioDelAlbum) {
    this.anioDelAlbum = anioDelAlbum;
  }

  public int getCantidadReproducciones() {
    return cantidadReproducciones;
  }

  public void setCantidadReproducciones(int cantidadReproducciones) {
    this.cantidadReproducciones = cantidadReproducciones;
  }

  public int getDislikes() {
    return dislikes;
  }

  public void setDislikes(int dislikes) {
    this.dislikes = dislikes;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public int getHorasReproduccion() {
    return horasReproduccion;
  }

  public void setHorasReproduccion(int horasReproduccion) {
    this.horasReproduccion = horasReproduccion;
  }

  public Popularidad getTipoPopularidad() {
    return tipoPopularidad;
  }

  public void setTipoPopularidad(Popularidad tipoPopularidad) {
    this.tipoPopularidad = tipoPopularidad;
  }

  //Constructor
  public Cancion(String nombredelArtista, String títuloDeLaCanción, String nombreDelAlbum, int anioDelAlbum, int cantidadReproducciones, int dislikes, int likes, int horasReproduccion) {
    this.nombredelArtista = nombredelArtista;
    this.títuloDeLaCanción = títuloDeLaCanción;
    this.nombreDelAlbum = nombreDelAlbum;
    this.anioDelAlbum = anioDelAlbum;
    this.cantidadReproducciones = cantidadReproducciones;
    this.dislikes = dislikes;
    this.likes = likes;
    this.horasReproduccion = horasReproduccion;
  }



}
