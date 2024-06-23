package i.stream.g;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example9_Optional {

  public static void main(String[] args) {

    // collect() // Collectors
    var list = Stream.of(1, 2, 3, 4, 5)   // [1,2,3,4,5]
      .map(n -> n * 2)                // [2,4,6,8,10]
      .collect(Collectors.toList());

    System.out.println(list);
  }

}
