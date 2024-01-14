package i.stream.g;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example3 {

  public static void main(String[] args) {
    Stream<Cat> stream = Stream.of(
      new Cat(3),
      new Cat(1),
      new Cat(4),
      new Cat(5),
      new Cat(9)
    );

    Comparator<Cat> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
    // stream.sorted(comparator) .. etc
    stream.sorted().forEach(cat -> System.out.println(cat.getAge()));

  }

}
