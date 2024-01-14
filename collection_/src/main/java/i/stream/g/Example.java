package i.stream.g;

import java.util.List;

public class Example {

  public static void main(String[] args) {
    List<Integer> list = List.of(3, 3, 5, 8, 7, 8, 9, 7, 5, 4, 1, 2);

    // distinct()
    // sorted() / sorted(Comparator)
    list.stream()
      /**
       * think about the order of intermediate operator when use it, because it can affect performance like distinct() and sorted()
       */
      .distinct() // remove duplication
      .sorted() // Comparable
      .forEach(System.out::println);
  }

}
