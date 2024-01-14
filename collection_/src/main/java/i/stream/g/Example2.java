package i.stream.g;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {

  public static void main(String[] args) {
    List<Integer> list = List.of(3, 3, 5, 8, 7, 8, 9, 7, 5, 4, 1, 2);

    // distinct()
    // sorted() / sorted(Comparator)

    Comparator<Integer> c = Collections.reverseOrder();
    list.stream()
      .distinct()
      .sorted(c)
      .forEach(System.out::println);
  }

}
