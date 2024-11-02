package ocp.oop.test;

public class Inheritance {

  public static void main(String[] args) {
    A a = new B();

    System.out.println(a.x);
    a.m();
  }
}

class A {

  int x = 6;

  void m() {
    System.out.println("A");
  }
}

class B extends A {

  int y = 8;

  void m() {
    System.out.println("B");
  }
}