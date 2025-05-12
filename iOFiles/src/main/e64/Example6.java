package main.e64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example6 {

  public static void main(String[] args) throws IOException {
    /**
     * lines();
     * list();
     * find();
     * walk();
     */


    // (p,a) : path, attribute of that path
    // BiPredicate(path, attribute)
    Files.find(Paths.get("."), 3, (p, a) -> a.size() < 100)
      .forEach(System.out::println);
  }

}
