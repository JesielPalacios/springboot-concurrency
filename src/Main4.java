import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static  java.util.stream.Collectors.toList;

public class Main4 {

  static int temp = 0;

  public static void main(String[] args) {

    // Streams / Lambda

    List<String> cities = new ArrayList<>();
    cities.add("London");
    cities.add("New York");
    cities.add("Tokyo");
    cities.add("Barcelona");
    cities.add("Buenos aires");
    cities.add("Bogota");
    cities.add("Ciudad de México");
    cities.add("Lima");

    // Way #3
    // Métodos terminales y no terminales
    // Un método terminar el todo aquel que se ubica al final
    // de la implementación de un patron de diseño Pipeline
    // generalmente se utilizan para definir la lógica.

    // List<String> filteresCities = cities.stream()
    //     .filter(city -> city.startsWith("B"))
    //     .filter(city -> city.contains("n"))
    //     .collect(Collectors.toList());
    
    // si un Stream no tiene dentro de su cadena
    // un método terminal no se va a ejecutar nada.

    List<String> filteresCities = cities.stream()
        .filter(city -> city.startsWith("B"))
        .filter(city -> city.contains("n"))
        .collect(toList());

  }

}
