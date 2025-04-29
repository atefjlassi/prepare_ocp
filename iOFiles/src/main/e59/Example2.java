package main.e59;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

  public static void main(String[] args) {
    // Input = read
    // Output = write

    // System.in

    // @see FileReader
    // @see InputStreamReader

    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(reader);

    // IOException and FileNotFoundException
    String line = null;
    try {
      line = in.readLine();
      System.out.println("Line: "+ line);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}