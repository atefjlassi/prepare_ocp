package myowntest;

import java.util.List;

public class q3 {

  public static void main(String[] args) {
    List<?> q = List.of("mouse", "parrot");
    var v = List.of("mouse", "parrot");

//    q.removeIf(String::isEmpty);
//    q.removeIf(s -> s.length() == 4);
    v.removeIf(String::isEmpty);
    v.removeIf(s -> s.length() == 4);
  }

}
