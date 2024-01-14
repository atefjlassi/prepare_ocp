package k.collectors;

import java.util.Optional;

// SUBJECT: Optional class
public class Example16 {

  public static void main(String[] args) {

    Optional<Integer> o1 = Optional.empty();      // empty box
    Optional<Integer> o2 = Optional.of(10); // 10 inside

    if (o2.isPresent()) {
      Integer i1 = o2.get();  // work only if optional is not empty, make sure that Optional is
    }


  }

}
