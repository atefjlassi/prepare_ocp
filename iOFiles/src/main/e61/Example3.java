package main.e61;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example3 {

  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("owner1");
      ObjectOutputStream out = new ObjectOutputStream(fos)) {

      // all object in the relation should be serializable
      // to solve the problem, two option (make dog serializable OR make dog property transient)
      var owner = new Owner("Bill", new Dog());
      // serialization
      out.writeObject(owner);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
