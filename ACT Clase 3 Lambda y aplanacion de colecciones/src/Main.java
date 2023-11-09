import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  static List<String> listaPalabras = Arrays.asList("Perro", "Gato", "Hamster", "Caballo", "Loro");
  static int unaCantidad = 4;
  public static void main(String[] args) {

    SeparadorString funcionSeparadora = (unaLst, cantidad)->{
      return concatenarOtraCadena(filtrarPorCantCaracteres(unaLst, cantidad)).toString();

    };

    System.out.print(funcionSeparadora.separator(listaPalabras, unaCantidad));


}

  public static List<String> filtrarPorCantCaracteres(List<String> lst, int cant){
    return lst.stream()
      .filter(item -> item.length() > cant)
      .collect(Collectors.toList());
  }

  public static List<String> concatenarOtraCadena(List<String> lst){
    return Collections.singletonList(lst.stream().map(item -> item + " Hola ")
      .collect(Collectors.joining(", "))
      .toString());
  }


}
