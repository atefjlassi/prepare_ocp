package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example9 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "AAA", "B", "CCCCC", "DDDD", "FFFFFF");

    System.out.println("\n######## grouping by ######### \n");
    Map<Integer, List<String>> map1 = list.stream()
      .collect(Collectors.groupingBy(s -> s.length()));

    System.out.println(map1);

    System.out.println("\n######## grouping by ######### \n");
    Map<Integer, String> map2 = list.stream()
      .collect(Collectors.groupingBy(s -> s.length(), // downstream
                  Collectors.mapping(s -> String.valueOf(s.length()), // downstream
                      Collectors.joining()))); // downstream

    System.out.println(map2);
  }

}
