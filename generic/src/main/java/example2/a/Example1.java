package example2.a;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    A<Integer> a1 = new A<Integer>();
    A<String> a2 = new A<String>();

    A<Integer> a3 = new A<Integer>();

    A<Number> a = new A<>() { // java 9
      // class that extends A

    };

  }
}
