package example5;

import java.util.*;

public class Example5 {

  public static void main(String[] args) {
    /**
     *  if you try to use treeset With Object that does not implement Comparator Or Comparable
     *  it will throw exception and it does not work
     */
    Set<Integer> set2 = new TreeSet<>(); // sorted set

    set2.add(10);
    set2.add(10); // no exception but will not added,
    set2.add(1000);
    set2.add(300);
    set2.add(247);

    set2.forEach(x -> System.out.println(x));
  }

}
