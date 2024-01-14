package example4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example4 {

  public static void main(String[] args) {

//    LinkedHashSet used to eliminate duplicate and save the order
    Set<Integer> set2 = new LinkedHashSet<>(); // ordered

    set2.add(10);
    set2.add(10); // no exception but will not added,
    set2.add(1000);
    set2.add(300);
    set2.add(247);

    for (Integer x : set2) {
      System.out.println(x); // not ordered
    }
  }
}
