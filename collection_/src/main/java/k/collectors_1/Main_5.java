package k.collectors_1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main_5 {

  public static void main(String[] args) {

    List<Integer> list = List.of();
    Optional<Integer> res1 =
                          list.stream()
                              .collect(Collectors.minBy((x, y) -> x - y));

    Optional<Integer> res2 =
                          list.stream()
                              .collect(Collectors.maxBy((x, y) -> x - y));

    Optional<Integer> res3 =
                          list.stream()
                              .collect(Collectors.reducing((a,b) -> a + b));




  }

}
