package main.e63;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

  public static void main(String[] args) {

    Path p1 = Paths.get("C:/a/b/c/d");

    // 0 index isn't the root
    System.out.println(p1.getRoot()); // C:
    for (int i = 0; i < p1.getNameCount(); i++) {
      System.out.println(p1.getName(i));
    }
  }
}
