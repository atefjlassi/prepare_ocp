package main.explore;

import java.io.File;
import java.nio.file.Path;

public class Example {

  public static void main(String[] args) {

    // Switching between File and Path
    /**
     * Since File and Path both reference locations on disk, it is helpful to be able to convert
     * between them. Luckily, Java makes this easy by providing methods to do just that
     */
    File file = new File("rabbit");
    Path nowPath = file.toPath();
    File backToFile = nowPath.toFile();
  }

}
