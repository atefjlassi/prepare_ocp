package main.e63;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// java io is legacy, use nio instead
public class Example7 {

  public static void main(String[] args) throws IOException {

    Path p1 = Paths.get("demo.txt");

    // it works only for files or empty folder

    Files.delete(p1); // throw an exception if the file does not exist
    boolean res = Files.deleteIfExists(p1);// does not throw an exception in this case
    System.out.println(res);
  }
}
