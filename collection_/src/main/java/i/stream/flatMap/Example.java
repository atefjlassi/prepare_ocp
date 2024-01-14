package i.stream.flatMap;

import java.util.List;
import java.util.stream.Stream;

public class Example {

  public static void main(String[] args) {
    // map  x -> y

    // flatMap()
    // flatMapToInt()
    // flatMapToLong
    // flatMapToDouble
    List<List<Integer>> list = List.of(
      List.of(1, 2, 3, 4, 5),
      List.of(4, 5, 6),
      List.of(1, 2)
    );

    Integer sum = list
      .stream() // [1, 2, 3, 4, 5], [4, 5, 6], [1, 2]
       // .flatMap(x -> x.stream()) // [1, 2, 3, 4, 5, 4, 5, 6, 1, 2]
      .flatMap(x -> x.stream())
      .reduce(0, (a, b) -> a + b);

    System.out.println(sum);

  }
}
