package ocp.oop.example8;

public class Main {
  public static void main(String[] args) {
    A a1 = new A();
    a1.x = 7;

    B b1 = new B();
    b1.x = 8; // x and m(), accessible for B
    b1.m();


  }
}
