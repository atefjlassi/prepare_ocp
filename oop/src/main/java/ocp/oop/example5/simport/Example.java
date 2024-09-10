package ocp.oop.example5.simport;

//static import ocp.oop.example5.third.B.m; //CF: import first

import static ocp.oop.example5.third.B.m;
import static ocp.oop.example5.third.B.x;
public class Example {
  public static void main(String[] args) {
    x = 10;
    m();
  }
}
