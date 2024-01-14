package k.collectors;

import java.util.Optional;

// SUBJECT: Optional class
public class Example14 {

  public static void main(String[] args) {

    // Optional born to avoid NPE problem
    String s1 = null;
    int n1 = s1.length(); // :( NullPointerException

  }

  static Optional<String> m1() { // Optional is a wrapper (box) class that may return a value or NOT
    // complex code
    return Optional.empty(); // empty box
  }

}
