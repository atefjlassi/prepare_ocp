package example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(15); // 0
    list.add(20); // 1
    list.add(23); // 2
    list.add(10); // 3
    list.add(4);  // 4
    int i = 0;

    // with enhanced for loop you cannot change the list while iterate
    // if you do (read and change the list at the same time) an exception will be thrown:
    // ConcurrentModificationException => list.add(4);

    System.out.println("#### Enhanced for loop ####");
    for (Integer x : list) {
      list.set(i, list.get(i) + i);
      // list.add(4);
      System.out.println(x);
    }

    System.out.println("##### using iterator #####");
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      Integer x = iterator.next();
      System.out.println(x);
    }

    System.out.println("#### for each ####");
    list.forEach(x -> System.out.println(x));

    System.out.println("########### remove object ############");

    // remove by index
    list.remove(3); // remove 10
    System.out.println(list); // [15, 20, 23, 4]

    // remove the first occurrence of this element
    list.remove((Integer) 20); // remove 20
    System.out.println(list); // [15, 23, 4]

  }

}
