package main.e63;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

  public static void main(String[] args) {

    Path p1 = Paths.get("C:/a/b/c/d");

    Path subpath = p1.subpath(0, 3);
    System.out.println(subpath);
  }
}
