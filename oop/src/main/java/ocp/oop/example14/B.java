package ocp.oop.example14;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A {

  //  void m() throws Exception => CF
  //  void m() throws FileNotFoundException => it works because: FileNotFoundException -> IOException -> Exception
  //  void m() => it works
  @Override
  void m() throws FileNotFoundException {
  }

}
