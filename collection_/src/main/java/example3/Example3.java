package example3;

import java.util.*;

public class Example3 {

  public static void main(String[] args) {
    Set<Integer> set1 = Set.of(10, 1000, 23, 300, 256, 1000); // exception because of duplicated values (1000)

    /**
     * if you use hashset with you owen object make sure to implement equals and hashcode.
     *
     * if two element have the same hashcode => they are not necessary equals.
     * if two element equals => they have the same hashcode
     */
    Set<Integer> set_ = Set.of(10, 1000, 23, 300, 256);

    for (Integer x: set_) {
      System.out.println(x); // not ordered
    }

    System.out.println("####");
    Set<Integer> set2 = new HashSet<>();

    set2.add(10);
    set2.add(10); // no exception but will not added
    set2.add(1000);
    set2.add(300);
    set2.add(247);

    for (Integer x: set2) {
      System.out.println(x); // not ordered
    }

    System.out.println("####");
    set2.forEach(x -> System.out.println(x));
  }

}
