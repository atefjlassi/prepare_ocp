package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

    List<String> res1 = list.stream()
      // intermediary ops
      .collect(Collectors.toList());// Collectors

    Set<String> res2 = list.stream().collect(Collectors.toSet());

    /**
     * if you want to collect them in specific implementation of Set (like TreeSet) = you should use toCollection(Supplier)
     * nb: in lambda expression, when you have the same parameter in the left side and the right side in the same order
     * => you can change it in the method referenced
     * () -> new TreeSet<>(); ==== TreeSet::new
     */
    TreeSet<String> res3 = list.stream().collect(Collectors.toCollection(TreeSet::new));

  }
}
