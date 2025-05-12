package main.e62;

import java.nio.file.Path;
import java.nio.file.Paths;

// Java Fundamentals - Lesson 62 - NIO, java.nio
public class Example1 {

  // "/a/b/c" absolute path because it start with /
  // "a/b/c" relative path because it does not start with /
  // "C:/a/b/c" absolute path even it does not start with / (windows OS)
  public static void main(String[] args) {
    // path instance refer to specific path
    // Path is a contract (interface)
    Path p1 = Paths.get("a/b/c");
    // second way to refer to path
    Path p2 = Paths.get("a", "b", "c");

    System.out.println(p1);
    System.out.println(p2);

//    System.out.println(p1.isAbsolute());
//    System.out.println(p2.isAbsolute());

    // the concrete class is class sun.nio.fs.WindowsPath
    System.out.println(p1.getClass());
  }
}
