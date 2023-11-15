import javax.swing.event.PopupMenuListener;

public class Main {
  public static void main(String[] args) {
    Popularidad normal = new Normal();
    Cancion coldplay = new Cancion("Harrison", "The Scientist"," A Rush of Blood to the Head", 2002,4000, 100, 5000, 100, normal);
    //coldplay.cambiarPopu(new EnAuge());
    System.out.println(coldplay.mostrarDetalleCancion() + "Y la popularidad cambia A:" + coldplay.getTipoPopularidad().getNombre());
  }
}
