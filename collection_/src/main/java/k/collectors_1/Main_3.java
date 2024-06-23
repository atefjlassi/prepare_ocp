package k.collectors_1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main_3 {

  public static void main(String[] args) {

    // reduce()

    List<Integer> list = List.of();
    Stream<Integer> stream = Stream.of(3, 1, 2, 7, 8, 9);

    int result =
      list.stream() // if there are no elements -> 4
        .reduce(4, (a, b) -> a + b);

    Optional<Integer> result_2 =
      list.stream() // it return Optional
        .reduce((a, b) -> a + b);

    System.out.println(result);
    System.out.println(result_2.isPresent());

  }

}