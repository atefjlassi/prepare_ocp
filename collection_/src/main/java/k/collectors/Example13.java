package k.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example13 {

  public static void main(String[] args) {

    List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");

    IntSummaryStatistics intSummaryStatistics_ =
      list.stream()
          .mapToInt(String::length)
          .summaryStatistics();

    System.out.println(intSummaryStatistics_);

    IntSummaryStatistics intSummaryStatistics$ =
      list.stream()
          .collect(Collectors.summarizingInt(s -> s.length()));

    System.out.println(intSummaryStatistics$);

  }

}
