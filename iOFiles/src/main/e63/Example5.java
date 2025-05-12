package main.e63;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example5 {

  public static void main(String[] args) {

    Path p1 = Paths.get("C:/b/c/d"); // absolute
    Path p2 = Paths.get("b/q/w"); // relative

    // error, cannot relativize when path are different, one is absolute and the other is relative
    Path p3 = p1.relativize(p2);
    System.out.println(p3);

    // C:\D2Point\work\prepare_ocp
    System.out.println(System.getProperty("user.dir"));
  }
}
