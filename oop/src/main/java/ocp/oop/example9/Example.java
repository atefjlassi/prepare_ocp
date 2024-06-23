package ocp.oop.example9;

public class Example {

  public static void main(String[] args) {

    Square s1 = new Square();
    s1.area = 10;
    s1.side = 10;

    Circle c1 = new Circle();
    // from outside the class only the area declared in Circle is accessible,
    // but inside the class it's accessible through super keyword.
    c1.area = "20";
    c1.radius = 20;
    c1.abc();

  }
}
