import java.util.ArrayList;
import java.util.List;

public class Main3 {

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
    // Aquí se usa el patrón de diseño: pipeline.

    // a - Lambda
    // cities.stream().forEach(city -> System.out.println(city));

    // b
    // cities.stream().forEach(city -> {
    // System.out.println(city + ", " + temp);
    // temp += 1;
    // });

    // c - Reference to a Method
    // cities.stream().forEach(Main::printCity); error
    // cities.stream().forEach(city -> printCity(city));
    // cities.stream().forEach(System.out::println);
    // cities.forEach(System.out::println);

    // Simple example of Parallel - Pipeline
    // cities.stream().parallel().forEach(System.out::println);

    cities.stream()
        .filter(city -> city.startsWith("B"))
        .forEach(System.out::println);

    // cities.stream()
    //     .filter(Main::filterCity) error
    //     .forEach(System.out::println);

  }

  public static boolean filterCity(String city) {
    return city.startsWith("B");
  }

  public static void printCity(String city) {
    System.out.println(city + ", " + temp);
    temp += 1;
  }

}
