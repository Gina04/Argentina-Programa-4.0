package cancionesTest;

import cancionesPopulares.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cancionesTest {

  @Test
  public void theScientisRecienSeLanzaTienePopularidadNormal(){
    Cancion coldplay = new Cancion("Harrison", "The Scientist"," A Rush of Blood to the Head", 2002,900, 100, 5000, 100);
    coldplay.cambpop();
    Assertions.assertEquals("normal",coldplay.getTipoPopularidad().getNombre());

  }

  @Test
  public void theScientisEstaEnAugePorSuperarElMinimoDeReproduccionesEsperadas(){
    Cancion coldplay = new Cancion("Harrison", "The Scientist"," A Rush of Blood to the Head", 2002,4000, 100, 5000, 100);
    coldplay.cambpop();
    Assertions.assertEquals("auge",coldplay.getTipoPopularidad().getNombre());


  }



}
