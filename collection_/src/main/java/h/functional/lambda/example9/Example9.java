package h.functional.lambda.example9;

import java.util.function.UnaryOperator;

public class Example9 {

  public static void main(String[] args) {
    // UnaryOperator is particular type of Function
    // what you receive as Generic type, is the same of what you return (what you receive is what you return in terms of Types)
    UnaryOperator<String> unaryOperator = s -> new StringBuilder(s).reverse().toString();
    String apply = unaryOperator.apply("! olleH ");
    System.out.println(apply);


    //
    UnaryOperator<Integer> u1 = u -> u + 1;
    Integer integer = u1.apply(10);
    System.out.println(integer);
  }

}
