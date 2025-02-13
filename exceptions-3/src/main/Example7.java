package main;

import java.security.MessageDigest;

public class Example7 {

  public static void main(String[] args) {
    //MessageDigest.getInstance("XYZ");
  }
  /**
   * Opinion: use checked exception only when develop a library, and you really want to inform user of library
   * to treat a specific kind of exception.
   * for all other cases use RuntimeException
   */
}