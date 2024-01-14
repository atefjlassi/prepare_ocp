package k.collectors;

import java.util.Optional;

public class Example18 {

  public static void main(String[] args) {

    Optional<Integer> o1 = Optional.empty();
    Optional<Integer> o2 = Optional.of(10);

    o2.ifPresent(x -> {        // since java 8
      System.out.println(x);
    });

    o2.ifPresentOrElse(x -> {  // since java 9

    }, () -> {

    });

  }

}
