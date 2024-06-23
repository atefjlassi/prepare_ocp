package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example20 {

  public static void main(String[] args) {
    Double collect = LongStream.of(6l, 8l, 10l)
      .mapToInt(x -> (int) x)
      .boxed()
      .collect(Collectors.groupingBy(x -> x))
      .keySet()
      .stream()
      .collect(Collectors.averagingInt(x -> x));

    System.out.println(collect);

    Double collect1 = LongStream.of(6l, 8l, 10l)
      .mapToInt(x -> (int) x)
      .boxed().collect(Collectors.groupingBy(x -> x, Collectors.toSet())).keySet().stream()
      .collect(Collectors.averagingInt(x -> x));

    System.out.println(collect1);
    List<Integer> objects = List.of();
//    Double collect2 =
//      LongStream.of(6l, 8l, 10l)
//      .mapToInt(x -> (int) x)
//        .collect(Collectors.groupingBy(x -> x))
//          .keySet()
//            .stream()
//              .collect(Collectors.averagingInt(x -> x));

//    Stream<String> s = Stream.generate(() -> "meow!");
//    var match = s.noneMatch(String::isEmpty);

    String collect2 = Stream.iterate(1, x -> ++x)
      .limit(5).map(x -> "" + x).collect(Collectors.joining());
    System.out.println("##########");
    System.out.println(collect2);

    System.out.println("##########");
    Stream<Integer> integerStream = Stream.of(1);

  }

}
