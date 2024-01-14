package i.stream.a;

import java.util.List;

public class Example_Stream {

  public static void main(String[] args) {
    List<Integer> list = List.of(10, 11, 4, 6, 8, 15);

    for (Integer x : list) {
      if (x % 2 == 0) {
        System.out.println(x);
      }
    }
    System.out.println("####");
    // only pass the value that respect the predicate
    list.stream()
      .filter(x -> x % 2 == 0) // i1
      .map(i1 -> i1 * 2) // i2
      .forEach(System.out::println); // :: => method reference operator = forEach(value -> System.out.println(value))

  }

}