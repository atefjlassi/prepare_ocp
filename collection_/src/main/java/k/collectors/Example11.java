package k.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example11 {

  public static void main(String[] args) {

    List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");
    // averagingInt, averagingLong, averagingDouble
    double sum =
      list.stream()
        .collect(Collectors.averagingInt(String::length));



    System.out.println(sum);


  }

}
