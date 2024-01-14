package k.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Example12 {

  public static void main(String[] args) {

    List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");
    // summarizingInt, summarizingLong, summarizingDouble
    /**
     * WHAT IF i want to take multiple value=result from the same stream ??
     */
    System.out.println("###### FIRST WAY: Repeat the stream = the same operation multiple time ######\n"
      + "affect the performance.");
    long count = list.stream()
                  .mapToInt(String::length)
                  .count();

    int sum = list.stream()
            .mapToInt(String::length)
            .sum();

    var average = list.stream()
        .mapToInt(String::length)
        .average();

    System.out.println("###### SECOND WAY: use SummaryStatistics ######");
    IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(String::length)
      .summaryStatistics();

    System.out.println(intSummaryStatistics);

  }

}
