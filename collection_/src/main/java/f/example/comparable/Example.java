package f.example.comparable;

import java.util.TreeSet;

public class Example {

  public static void main(String[] args) {

    var set = new TreeSet<>();
    /**
     * without implementing Comparable in Cat class an Exception will thrown
     * Exception in thread "main" java.lang.ClassCastException: class f.example.comparation.Cat cannot be cast
     * to class java.lang.Comparable
     * ***
     * it means that treeSet does not know how to compare your instances
     */
    set.add(new Cat(4));
    set.add(new Cat(1));
    set.add(new Cat(6));
    set.add(new Cat(2));

    set.forEach(System.out::println);
  }

}
