package h.functional.lambda.example7;

import java.util.function.Predicate;

public class Example7 {

  public static void main(String[] args) {
    Predicate<Integer> predicate = x -> x % 2 == 0;

    boolean test = predicate.test(10);
    System.out.println(test);

    System.out.println(predicate.test(5));

  }

}
