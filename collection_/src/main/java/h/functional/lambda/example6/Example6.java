package h.functional.lambda.example6;

import java.util.function.BiFunction;

public class Example6 {

  public static void main(String[] args) {
    // BiFunction: consume two value, and supply one
    BiFunction<Integer, Integer, String> biFunction = (a, b) -> a+""+b;
    String res = biFunction.apply(4, 7);
    System.out.println(res);
  }

}
