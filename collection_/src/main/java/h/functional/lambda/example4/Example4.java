package h.functional.lambda.example4;

import java.util.function.Supplier;

public class Example4 {

  public static void main(String[] args) {
    // why we don't have BiSupplier ?
    // Because supplier do not receive any parameter and return an Object (one value)
    // Generic type is the returned value
    Supplier<Integer> supplier = () -> 10;
    Integer s = supplier.get();
    System.out.println(s);
  }

}
