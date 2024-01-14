package i.stream.d;

import java.util.List;

public class Example {

  public static void main(String[] args) {
    List<String> list = List.of("abcd", "azerty", "uiop");

    // java.util.function -> Function<T,R>
    // Function<T,T> --> UnaryOperator<T>
    // Function<T, Boolean> --> Predicate<T>
    var x = list.stream().map(s -> s.length()).peek(System.out::println)
      // I cannot use .sum(), .sum() available only with Stream of type IntStream etc
      // for more information = see stream.f.Example
      .reduce(0, (a, b) -> a + b);

    // 0 + 4 = 4
    // 4 + 6 = 10
    // 10 + 4= 14

    System.out.println("result: " + x);

  }

}
