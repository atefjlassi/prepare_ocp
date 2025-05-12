package main.e63;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example9 {

  public static void main(String[] args) throws IOException {

    Path p1 = Paths.get("demo.txt");
    Path p2 = Paths.get("copied.txt");

    // not comparing content
    boolean sf = Files.isSameFile(p1, p2);
    System.out.println(sf); // false if both files exist, else an exception

    // what if both files doesn't exist and they are the same !?

    Path p3 = Paths.get("not_exist.txt");
    Path p4 = Paths.get("not_exist.txt");

    System.out.println(Files.isSameFile(p3, p4)); // return true

    // what is both files doesn't exist but they're not the same !?
    Path p5 = Paths.get("not_exist1.txt");
    Path p6 = Paths.get("not_exist2.txt");

    System.out.println(Files.isSameFile(p5, p6)); // exception
  }

}
