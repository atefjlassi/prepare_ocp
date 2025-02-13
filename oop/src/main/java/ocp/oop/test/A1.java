package ocp.oop.test;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class A1 {

  public static void main(String[] args) {
    A a = new A();
    B b = (B) a;
  }

}

class B2 extends A1 {

}
