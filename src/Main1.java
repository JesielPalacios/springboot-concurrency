import java.util.ArrayList;
import java.util.List;

public class Main1 {

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

    // Way #1
    for (int i = 0; i < cities.size(); i++) {
      System.out.println(cities.get(i) + ", " + i);
    }

  }
}