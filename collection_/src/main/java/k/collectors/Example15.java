package k.collectors;

import java.util.Optional;

// SUBJECT: Optional class
public class Example15 {

  public static void main(String[] args) {

    Optional<Integer> o1 = Optional.empty();      // empty box
    Optional<Integer> o2 = Optional.of(10); // 10 inside
//    Optional<Integer> o3 = Optional.of(null); throws an NPE exception
//    Optional<Integer> o3 = Optional.of(m1()); // throws an exception whenever m1() returns null

    Optional<Integer> o4 = Optional.ofNullable(null); // will throw an NPE exception
    Optional<Integer> o5 = Optional.ofNullable(m1()); // won't throw an exception whenever m1() returns null

    boolean b1 = o1.isPresent(); // false
    boolean b2 = o2.isPresent(); // true

    System.out.println(b1);
    System.out.println(b2);


  }

  static Integer m1() {
    return null;
  }

}
