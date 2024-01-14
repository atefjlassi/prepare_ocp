package i.stream.flatMap;

import java.util.Arrays;
import java.util.List;

public class Example_2 {

  public static void main(String[] args) {
    // map  x -> y

    List<String> list = List.of("4j7s8", "xu47s8", "az710");
    // 9 digits
    String digits = "0123456789";

    long x =
    list.stream() // "4j7s8", "xu47s8", "az710"
      .flatMap(s -> Arrays.stream(s.split("")))
      .filter(s -> digits.contains(s)) // "4", "7", "8", "4", "7", "8", "7", "1", "0"
      .count();

    System.out.println(x);
  }
}
