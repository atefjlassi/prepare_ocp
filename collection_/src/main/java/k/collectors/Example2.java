package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF");
    Map<String, Integer> map = list.stream().collect(Collectors.toMap(
      s -> s,
      s -> s.length()));

    System.out.println(map);

  }

}
