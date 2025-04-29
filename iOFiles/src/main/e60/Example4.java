package main.e60;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Example4 {

  public static void main(String[] args) {
    try(PrintStream out = new PrintStream("test3.txt")) {
      out.println("Salem, Hello World!");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
