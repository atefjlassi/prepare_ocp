package h.functional.lambda.example8;

import java.util.function.BiPredicate;

public class Example8 {

  public static void main(String[] args) {
    // Predicate is particular type of Function
    // BiPredicate is particular type of BiFunction
    BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() == i;

    boolean b1 = biPredicate.test("Hello", 5);
    boolean b2 = biPredicate.test("Hello", 7);

    System.out.println(b1);
    System.out.println(b2);
  }
}
