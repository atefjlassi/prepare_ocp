package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * NEED MORE Explanation 1
 */
public class Example3 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "AAA", "B", "CCCCC", "DDDD", "FFFFFF");
    // without BinaryOperation Exception will throwed
    // collect(Collectors.toMap(s -> s, s -> s.length(), (a, b) -> a + b))
    // Duplicate key AAA (attempted merging values 3 and 3)
    Map<String, Integer> map = list
      .stream()
      .collect(Collectors.toMap(s -> s, s -> s.length(), (a, b) -> a + b));

    System.out.println(map);

  }

}
