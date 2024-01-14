package h.functional.lambda.example10;

import java.util.function.BinaryOperator;

public class Example10 {

  public static void main(String[] args) {
    BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

    Integer res = binaryOperator.apply(10, 20);
    System.out.println(res); // 30


  }

}
