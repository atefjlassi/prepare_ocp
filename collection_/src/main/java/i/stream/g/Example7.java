package i.stream.g;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

  public static void main(String[] args) {
    // skip()
    // peek()
    // takeWhile()
    // dropWhile()

    List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<Integer>  output_not_recommanded = new ArrayList<>();
//    input.stream()
//      .filter(n -> n % 2 == 0)
//      .peek(p-> output_not_recommanded.add(p)) // bad practice
//      .forEach(i-> System.out.println(i));


    var output = input.stream()
      .peek(System.out::println)
      .filter(n -> n % 2 == 0)
      .collect(Collectors.toList());

    System.out.println(output);

  }

}
