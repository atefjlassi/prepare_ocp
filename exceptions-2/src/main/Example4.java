package main;

public class Example4 {

  public static void main(String[] args) {
    int x = m();
    System.out.println(x); // 20
  }

  public static int m() {
    try {
      return 10;
    } finally {
      // not recommended to have a return in catch / finally in real world scenario
      return 20;
    }
  }
}