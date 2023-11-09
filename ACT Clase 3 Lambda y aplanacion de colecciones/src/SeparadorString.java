import java.util.List;

@FunctionalInterface
public interface SeparadorString {

  String separator(List<String> lstPalabras, int unNumero);
}
