package main.e64;

import java.io.File;
import java.io.IOException;

public class Example7 {

  public static void main(String[] args) {
    /**
     * nio use abstraction, (interface) so the JVM use the implementation depends on the operating system
     */
    File f = new File("test"); // legacy
    try {
      f.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}