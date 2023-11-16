package cancionesTest;

import cancionesPopulares.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cancionesTest {

  @Test
  public void theScientisRecienSeLanzaTienePopularidadNormal(){
    Popularidad normal = new Normal();
    Cancion coldplay = new Cancion("Harrison", "The Scientist"," A Rush of Blood to the Head", 2002,900, 100, 5000, 100, normal);

    Assertions.assertEquals("normal",coldplay.getTipoPopularidad().getNombre());

  }

  @Test
  public void theScientisEstaEnAugePorSuperarElMinimoDeReproduccionesEsperadas(){
    Popularidad normal = new Normal();
    Cancion coldplay = new Cancion("Harrison", "The Scientist"," A Rush of Blood to the Head", 2002,900, 100, 5000, 100, normal);

    Assertions.assertEquals("auge",coldplay.getTipoPopularidad().getNombre());


  }



}
