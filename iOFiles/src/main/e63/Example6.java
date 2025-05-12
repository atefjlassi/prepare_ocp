package main.e63;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// java io is legacy, use nio instead
public class Example6{

  public static void main(String[] args) throws IOException {

    Path p1 = Paths.get("demo.txt");

    Files.createFile(p1);
  }
}
