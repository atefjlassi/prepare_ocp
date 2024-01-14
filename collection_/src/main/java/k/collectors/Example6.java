package k.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "AAA", "B", "CCCCC", "DDDD", "FFFFFF");

    List<Integer> res = list.stream().collect(
      Collectors.mapping(s -> s.length(), // String -> int
        Collectors.toList()) //downstreaming
    );

    System.out.println(res);
  }

}
