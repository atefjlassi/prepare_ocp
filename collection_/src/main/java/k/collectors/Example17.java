package k.collectors;

import java.util.Optional;
import java.util.function.Supplier;

public class Example17 {

  public static void main(String[] args) {

    Optional<Integer> o1 = Optional.empty();      // empty box
    Optional<Integer> o2 = Optional.of(10); // 10 inside

    // orElse
    Integer i1 = o1.orElse(-1);  // -1
    Integer i2 = o2.orElse(-1);  // 10

    // just use supplier if you need, process and return value for example, sinon orElse est suffisant
    Supplier<Integer> supplier = () -> -1;
    Integer i3 = o2.orElseGet(supplier);  // 10

    Integer i4 = o2.orElseThrow(() -> new RuntimeException()); // 10

    // if o1 contain nothing then o2 , Else return -1
    Integer i5 = o1.or(() -> o2).orElse(-1);

    o1.ifPresentOrElse(x-> System.out.println(x), () -> System.out.println("there is no value"));
  }

}
