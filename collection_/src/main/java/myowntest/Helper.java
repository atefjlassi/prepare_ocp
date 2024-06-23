package myowntest;

import java.awt.event.HierarchyListener;
import java.io.FileNotFoundException;

public class Helper  <U extends Exception>{

  public static  <U extends Exception> void printException(U u) {

    System.out.println(u.getMessage());
  }

  public static void main(String[] args) {
    Helper.printException(new FileNotFoundException("a"));
    Helper.printException(new Exception("a"));
    Helper.<NullPointerException>printException(new NullPointerException("E"));
  }
}