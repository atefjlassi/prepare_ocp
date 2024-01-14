package i.stream.g;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example4 {

  public static void main(String[] args) {
    Stream<Dog> stream = Stream.of(
      new Dog(3),
      new Dog(1),
      new Dog(4),
      new Dog(5),
      new Dog(9)
    );

    Comparator<Dog> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
    stream.sorted(comparator).forEach(dog -> System.out.println(dog.getAge()));

  }

}
