package i.stream.g;

import java.util.List;

public class Example8_dropWhile_takeWhile {

  public static void main(String[] args) {
    // takeWhile()
    // dropWhile()

    List<Integer> input = List.of(1, 2, 3, 50, 70, 100, 130, 20, 5);

    System.out.println("###### takeWhile #######");

    input.stream()
      .takeWhile(n -> n <= 100) // while(condition)
      .forEach(System.out::println); // [1, 2, 3, 50, 70, 100]

    System.out.println("###### dropWhile #######");
    // dropWhile is the opposite of takeWhile
    input.stream()
      .dropWhile(n -> n <= 100) // [130, 20, 5]
      .forEach(System.out::println);


  }

}
