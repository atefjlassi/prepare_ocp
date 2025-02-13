package s4;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // use producer consumer approach example to explain threads

  // ArrayList, are not by default synchronized
  // it represent a shared resource, without synchronized bloc, a race condition error will occur
  // race condition problem: multiple thread access to the same shared resource
  public static List<Integer> bucket = new ArrayList<>();

  public static void main(String[] args) {
    // synchronization is only done through synchronized keyword, there is other ways (use join etc... )

    Producer p1 = new Producer("p1");
    Producer p2 = new Producer("p2");
    Consumer c1 = new Consumer("c1");
    Consumer c2 = new Consumer("c2");

    p1.start();
    p2.start();
    c1.start();
    c2.start();



  }
}
