package main.e62;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example5 {

  public static void main(String[] args) {
    Path p1 = Paths.get("/a/b/c");
    Path p2 = Paths.get("/d/e/f");

    System.out.println(p1.resolve(p2)); // \d\e\f

    System.out.println(p2.resolve(p1)); // \a\b\c
  }

}
