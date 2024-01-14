package h.functional.lambda.example5;

import java.util.function.Function;

public class Example5 {

  public static void main(String[] args) {
    // Function do the both: consume a value in order to return a value (consume and supply)
    Function<String, Integer> f1 = s -> s.length();

    Integer x = f1.apply("Hello");
    System.out.println(x);
  }

}
