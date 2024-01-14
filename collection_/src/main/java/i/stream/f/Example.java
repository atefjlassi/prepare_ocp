package i.stream.f;

import java.util.List;

public class Example {

  public static void main(String[] args) {
    List<String> list = List.of("abcd", "azerty", "uiop");

    /**
     * used to transform Stream from more general (abstract) Stream contract to more particular Stream contract
     * and apply specific operations on them.
     */
    // Stream
    // map(Function) : Stream -> Stream
    // mapToInt(ToIntFunction) : Stream -> IntStream
    // mapToLong(ToLongFunction): Stream -> LongStream
    // mapToDouble(ToDoubleFunction): Stream -> DoubleStream

    // ############

    // IntStream
    // map(IntFunction) IntStream -> IntStream
    // mapToLong(IntToLongFunction) IntStream -> LongStream
    // mapToDouble(IntToDoubleFunction) IntStream -> DoubleStream
    // mapToObj(IntFunction) IntStream -> Stream

    // LongStream, DoubleStream

    var x = list.stream()
      .mapToInt(s -> s.length()) // IntStream (instead of Stream) -> Stream
      .mapToObj(s -> s) // IntStream ->Stream
      .mapToInt(s -> s) // Stream -> IntStream
      .sum();

    System.out.println("result: " + x);

  }

}
