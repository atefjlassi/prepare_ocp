package ocp.oop.test;

public class AutoBoxing {

  static void execute() {
    System.out.print("1-");
  }

  static void execute(int num) {
    System.out.print("2-");
  }

  static void execute(Integer num) {
    System.out.print("3-");
  }

  static void execute(Object num) {
    System.out.print("4-");
  }

  static void execute(int ... nums) {
    System.out.print("5-");
  }

  public static void main(String[] args) {
    AutoBoxing.execute(100);
    AutoBoxing.execute(100L);
  }
}
