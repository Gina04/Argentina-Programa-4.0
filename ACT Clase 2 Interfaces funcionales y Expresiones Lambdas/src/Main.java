// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    String unaPalabra = "hola mundo";

    TransformString stringToUppercase = (a) -> {
      return a.toUpperCase();
    };

    stringToUppercase.fromLowercaseToUppercase(unaPalabra);

    System.out.println("Palabra en mayúscula "+ stringToUppercase.fromLowercaseToUppercase(unaPalabra));


  }
}
