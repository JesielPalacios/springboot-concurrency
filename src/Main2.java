import java.util.ArrayList;
import java.util.List;

public class Main2 {

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

    // Way #2
    int temp = 0;

    for (String city : cities) {
      System.out.println(city + ", " + temp);
      temp += 1;
    }

  }
}