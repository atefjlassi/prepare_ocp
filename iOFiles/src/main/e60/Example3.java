package main.e60;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Example3 {

  public static void main(String[] args) {
    // Reader ---> InputStreamReader / FileReader

    try {
      BufferedReader in = new BufferedReader(
        new InputStreamReader(
          new FileInputStream("test2.txt")));
      // to read the hole content, should read until the end of file
      String line = null;
      while ((line = in.readLine()) != null) {
        System.out.println(line);
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
}
