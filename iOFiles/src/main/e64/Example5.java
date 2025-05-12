package main.e64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example5 {

  public static void main(String[] args) throws IOException {
    /**
     * lines();
     * list();
     * find();
     * walk();
     */


    Files.walk(Paths.get("."), 3)
      .forEach(System.out::println);
  }

}
