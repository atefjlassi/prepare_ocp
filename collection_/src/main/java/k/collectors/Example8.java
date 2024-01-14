package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example8 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "AAA", "B", "CCCCC", "DDDD", "FFFFFF");
    /**
     * Partitioning by = is a particular case of grouping by
     * it divide our list in just TWO Groups = {false=[...], true = [...]}
     */
    System.out.println("\n######## example ######### \n");
    Map<Boolean, List<String>> res_ = list.stream()
      .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));

    System.out.println(res_);

    System.out.println("\n##### after partitioning #### \n");

    Map<Boolean, Set<String>> toSet_ = list.stream()
      .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0,
        Collectors.toSet())); // downstream
    System.out.println(toSet_);

    System.out.println("\n##### after partitioning with joining downstream  ####\n");

    Map<Boolean, String> map3 = list.stream()
      .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0,
        Collectors.joining())); // downstream

    System.out.println(map3);

    System.out.println("\n##### after partitioning, mapping and joining downstream  ####\n");
    /**
     * collecting and recollecting with downstream
     */
    Map<Boolean, String> map4 = list.stream()
      .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0,
        Collectors.mapping(s -> s.length() + "", // downstream
          Collectors.joining()))); // downstream

    System.out.println(map4);
  }

}
