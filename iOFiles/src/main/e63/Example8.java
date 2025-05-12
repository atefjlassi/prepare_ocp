package main.e63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example8 {

  public static void main(String[] args) throws IOException {

    Path p1 = Paths.get("demo.txt");
    Path p2 = Paths.get("copied.txt");

    // Files.copy(p1, p2);


    // can move from one folder to another OR move to the same folder which is mean (rename)
    Files.move(p1, p2);

  }

}
