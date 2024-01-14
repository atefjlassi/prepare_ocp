package k.collectors_1;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main_4 {

  public static void main(String[] args) {
    // primitive stream
    // IntStream, LongStream, DoubleStream, -> map() -> mapToInt()

    // OptionalInt, OptionalLong, OptionalDouble

    // average(), min(), max(), reduce()

    OptionalDouble average = IntStream.of(1, 4, 5, 6, 7).average();
    OptionalInt max = IntStream.of(1, 4, 5, 6, 7).max();
    OptionalInt min = IntStream.of(1, 4, 5, 6, 7).min();
    System.out.println(average.getAsDouble() + "-" + max.getAsInt() + "-" + min.getAsInt());


  }
}
