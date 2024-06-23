package ocp.oop.example3;

public class Cat {

  String name;
  final static String x = ":)";
  final static String y;

  static {
    // y should be init in a static bloc
    y = "";
    System.out.println("D");
  }

  static {
    System.out.println(x);
    System.out.println("C");
  }
  Cat() {
    System.out.println("A cat was created");
  }

  // none static anonymous bloc
  {
    System.out.println("A");
  }

  // static anonymous bloc
  static {
    System.out.println("B");
  }

  static void sayMeow() {
    System.out.println("Meow !");
  }

}
