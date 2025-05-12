package main.e64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example4 {

  public static void main(String[] args) throws IOException {
    /**
     * lines();
     * list();
     * find();
     * walk();
     */

    // list(); return stream of string contain list of directory and files
    Files.list(Paths.get("."))
      .filter(p -> p.toString().endsWith(".txt"))
      .forEach(System.out::println);
  }

}
