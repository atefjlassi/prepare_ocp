package main.e61;

// Java Fundamentals - Lesson 61 - Serialization

// a serialization is a mechanism of JVM that allow to transform an instance of object into series of bytes
// useful to send bytes through the streams (IO STREAM FOR EXAMPLE)
// nowadays we use json instead of serialization, serialization has many issues
// (eg: the both parties should be java app to be able to deserialize the object)

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// to prove how it works, we will save object into files
public class Example1 {

  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("cat1");
      ObjectOutputStream out = new ObjectOutputStream(fos)) {

      var cat = new Cat("Tom", 5);

      // serialization
      // versioning (after saving the object -> changing the class -> try to read the saved object)
      // an exception java.io.InvalidClassException: main.e61.Cat; local class incompatible: stream classdesc serialVersionUID = -8692366093366139685, local class serialVersionUID = -7169875739190254447

      // should control versioning mechanism,  (declare serialVersionUID and make it unchangeable)
      // if serialVersionUID is changed even without changing the class structure, the code won't compile
      // java.io.InvalidClassException: main.e61.Cat; local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
      out.writeObject(cat);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
