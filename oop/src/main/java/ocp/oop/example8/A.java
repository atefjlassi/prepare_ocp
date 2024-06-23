package ocp.oop.example8;

public class A {
  int x;
  private int y; // cannot be inherited by B, y accessible only inside class A
  void m() {
    System.out.println(":)");
  }
}
