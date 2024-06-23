package ocp.oop.example;

public class Main {

  public static void main(String[] args) {
    final int x;
    x = 10;

    final var y = 4; // should be assigned directly
  }

  void m(final int x) {

  // x = 10; CF to reassign a final param

  }
}