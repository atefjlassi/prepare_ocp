package ocp.oop.example19;

public class Main {

  public static void main(String[] args) {

    A a1 = new A();

    B b2 = new B();

    A a2 = new B();

    // can refer to x and y
    b2.x = 10;
    b2.y = 30;

    // only refer to x
    a2.x = 7;

    // CF y exist, but you can't access it anymore, only you can access what is declared in the type store the reference
    // a2.y = 5;

    }
}
