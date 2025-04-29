package main.e60;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Example5 {

  public static void main(String[] args) {
    try(PrintWriter out = new PrintWriter(new FileOutputStream("test4.txt"))) {
      out.println("Hello World!");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
