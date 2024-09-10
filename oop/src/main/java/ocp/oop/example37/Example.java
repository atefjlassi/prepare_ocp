package ocp.oop.example37;

import ocp.oop.example37.A1.A3;

public class Example {

  public static void main(String[] args) {
    A3 a3 = new A3();
    // or
    A1.A3 a31 = new A1.A3();

    // A1.A2 a2 = new A1.A2(); A2 need to be static else CF,
    // OR create an instance for A2() through an instance of A1
    // highly coupled, it's not possible to have an instance of A2 without having an instance of A1
    A1 a1 = new A1();
    A1.A2 a2 = a1.new A2();
  }
}
