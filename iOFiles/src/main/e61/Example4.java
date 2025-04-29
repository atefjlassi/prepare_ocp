package main.e61;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example4 {

  public static void main(String[] args) {
    /**
     * in the write action, all constructor are called (A, B, C)
     * in the read action, only the A constructor is called (A)
     * why ?
     * because the only information stored in the file 'c', are the serializable information of (B, C).
     * since A is not serializable in the read action it should be recreated.
     * that's why we only see the constructor of A is called
     *
     * what's above B wasn't stored in the file.
     */


    // writeObject();
     readObject();
  }


  static void writeObject() {
    C c = new C(); // A B C
    try (FileOutputStream fos = new FileOutputStream("c");
      ObjectOutputStream out = new ObjectOutputStream(fos)) {
      out.writeObject(c);
    } catch (IOException e) {
    }
  }

  static void readObject() {
    try (var fis = new FileInputStream("c");
      var input = new ObjectInputStream(fis)) {

      // deserialization
      C c = (C) input.readObject();
      System.out.println(c);

    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }
  }
}
