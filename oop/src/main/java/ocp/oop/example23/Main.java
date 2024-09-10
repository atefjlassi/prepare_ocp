package ocp.oop.example23;

public class Main {

  public static void main(String[] args) {
    Shape s1 = new Rectangle();
    Shape s2 = new Circle();

    System.out.println(s1.area()); // 0: call area of Rectangle
    System.out.println(s2.area()); // 0: call area of Circle
  }
}
