package h.functional.lambda.example3;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example3 {

  public static void main(String[] args) {
    // Example of consumer
    List<String> list = List.of("one", "two", "three");
    Consumer<String> consumer = System.out::println;
    list.forEach(consumer);

    // Example of BiConsumer
    Map<Integer, String> map = Map.of(10, "ten", 11, "eleven", 12, "twelve");
    BiConsumer<Integer, String> biConsumer = (k, v) -> System.out.println(k + " - ".concat(v));
    map.forEach(biConsumer);

  }

}
