package main.e60;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example2 {

  public static void main(String[] args) {
    // a High-level output stream can be wrapped with it Low-level output stream only
    // a Low-level input stream can be wrapped with it High-level input stream

    Writer w = null;
    BufferedWriter out = null;

    try {
      w = new FileWriter("test2.txt");
      out = new BufferedWriter(w);

      out.write("Hello World!2");
      // without out.flush(); the information will not be saved
      out.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
