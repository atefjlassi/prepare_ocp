package main.e61;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {

  public static void main(String[] args) {

    try (var fis = new FileInputStream("cat1");
      var input = new ObjectInputStream(fis)) {

      // deserialization
      Cat cat = (Cat) input.readObject();
      System.out.println(cat);

    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }
  }
}
