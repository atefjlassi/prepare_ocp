package k.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "AAA", "B", "CCCCC", "DDDD", "FFFFFF");

    System.out.println("##### just to understand down-streaming ####");
    List<Integer> res = list.stream().collect(
      Collectors.mapping(s -> s.length(), // String -> int
        Collectors.filtering(n -> n % 2 == 0,
          Collectors.toList())) //downstream
    );

    System.out.println(res);

    System.out.println("######## this way is more clean #########");
    var res_ = list.stream()
        .map(String::length)
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

    System.out.println(res_);
  }

}
