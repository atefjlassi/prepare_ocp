package ocp.oop.example35;

public class Example {

  public static void main(String[] args) {
    X x1 = a -> System.out.println(":)");
    X x2 = (a) -> System.out.println(":)");
    X x3 = (int a) -> System.out.println(":)");
    X x4 = (var a) -> System.out.println(":)");

    Y y1 = (a, b) -> System.out.println(":)");
    Y y2 = (int a, int b) -> System.out.println(":)");
    Y y3 = (var a, var b) -> System.out.println(":)");
    // Y y3 = (var a, int b) -> System.out.println(":)"); // CF: Cannot mix 'var' and explicitly typed parameters in lambda expression
  }
}
