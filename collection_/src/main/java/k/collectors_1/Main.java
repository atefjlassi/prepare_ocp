package k.collectors_1;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    // findFirst(); // terminal
    // findAny();
    // --> the both return Optional

    Stream<Integer> s1 = Stream.empty();
    Stream<Integer> s2 = Stream.of(10, 20, 30);

//    var o1 = s1.findFirst(); BE CAREFUL IN THE EXAM ITS OPTIONAL
    Optional<Integer> o1 = s1.findFirst();
    System.out.println(o1.isPresent()); // false

    Optional<Integer> o2 = s2.findFirst();
    System.out.println(o2.isPresent()); // true

    int x = o2.get();
    System.out.println(x);
  }

}
