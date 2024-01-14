package i.stream.e;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

  public static void main(String[] args) {
    List<String> list = List.of("abcd", "azerty", "uiop");

    var x = list.stream()
      .map(s -> new StringBuilder(s).reverse().toString())
      .peek(System.out::println)
      .collect(Collectors.toList());

    System.out.println("result: " + x);

  }

}
