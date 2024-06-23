package i.stream.b;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example {

  public static void main(String[] args) {
    // to avoid using null
    Stream<Integer> s1 = Stream.empty();

    Stream<Integer> s2 = Stream.of(5, 7, 8);
    s2.forEach(System.out::println); // source - terminal Operation, without intermediate

    // using generator method
    System.out.println("### s3 :: infinite stream source ###");
    Supplier<Integer> supplier = () -> new Random().nextInt(100);
    Stream<Integer> s3 = Stream.generate(supplier); // infinite source
    // s3.forEach(System.out::println);
    s3.limit(10)
      .forEach(System.out::println); // limit the number of produced value: print only 10 values

    System.out.println("### s4 :: infinite stream source ###");
    // public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
    Stream<Integer> s4 = Stream.iterate(1, i -> i + 1); // infinite, need limit intermediate operator
    s4.limit(15).forEach(System.out::println);

    System.out.println("### s5 :: finite stream  source ###");
    // iterate with predicate (condition d'arrêt)
    //public static<T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
    Stream<Integer> s5 = Stream.iterate(1, i -> i <= 10, i -> i + 1); // finite Stream source
    s5.forEach(System.out::println);
  }



  public List<Integer> m1() {
    //do something. some case instead of returning null (anti-pattern), return an empty list
    return Collections.emptyList();
  }

  public Stream<Integer> m2() {
    //do something. some case instead of returning null (anti-pattern), return an empty Stream
    return Stream.empty();
  }
}
