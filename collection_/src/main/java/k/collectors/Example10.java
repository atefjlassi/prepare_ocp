package k.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example10 {

  public static void main(String[] args) {

    // summingInt, summingLong, summingDouble
    List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");
    int sum =
      list.stream() // ["AAA", "BB", "C", "DDDDDD", "E"]
        .mapToInt(value -> value.length()) // [3, 2, 1, 6, 1]
        .sum();

    System.out.println(sum);

    Integer sum2 =
      list.stream()
        .collect(Collectors.summingInt(value -> value.length()));
//            .collect(Collectors.summingLong(value -> (long) value.length()));

    System.out.println(sum2);

    long sum3 =
      list.stream()
        .collect(Collectors.summingLong(value -> (long) value.length()));
//        .collect(Collectors.summingLong(value -> value.length())); == CF

    System.out.println(sum3);
  }

}
