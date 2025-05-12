package main.e63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example10 {

  public static void main(String[] args) throws IOException {

    Path p1 = Paths.get("demo.txt");

    var res = Files.readAllLines(p1);
    res.forEach(System.out::println);

    String s = Files.newBufferedReader(p1).readLine();
    System.out.println(s);

  }

}
