package ocp.oop.example1;

public class Example1 {

  public static void main(String[] args) {

    Bottle b1 = new Bottle(5);
    Bottle b2 = new Bottle(10);

    // b1.volume = 7; CF

    Foo foo1 = new Foo();
    foo1.x = 10;

    Foo foo2 = new Foo();
    foo2.x = 20;

    System.out.println(foo1.x); // 10
    System.out.println(foo2.x); // 20

    Foo.y = 30;

    System.out.println(Foo.y);

    foo2.y = 4;

    System.out.println(Foo.y);

    // Foo.z = 6; // CF

  }

}
