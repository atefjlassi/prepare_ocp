package k.collectors;

import java.util.Optional;
import java.util.stream.Collectors;

public class Example19 {

  public static void main(String[] args) {

    Optional<Integer> o1 = Optional.empty();
    Optional<Integer> o2 = Optional.of(10);

    var count = o2.stream() // stream of one optional
      .collect(Collectors.counting());

    System.out.println(o2);

    var r = o2.filter(x -> x % 2 == 0).orElse(-1);
  }

}
