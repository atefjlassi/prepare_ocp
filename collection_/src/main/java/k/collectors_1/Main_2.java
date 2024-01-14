package k.collectors_1;

import java.util.List;
import java.util.Optional;

public class Main_2 {

  public static void main(String[] args) {

    // min()
    // max()

    List<Integer> list = List.of(3, 1, 2, 7, 8, 9);
    Optional<Integer> min = list.stream().min((x, y) -> x - y);
    min.ifPresent(System.out::println);

    Optional<Integer> max = list.stream().max((x, y) -> x - y);
    max.ifPresent(System.out::println);
  }

}
