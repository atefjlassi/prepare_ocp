package ocp.oop.example16;

public class B extends A {

//  public B() { // CF if constructor of class A is private, also if B and A does not have the same signature
//    System.out.println("B");
//  }

  public B() {
    super(9);
    System.out.println("B");
  }

  public B(int x) {
    //super(x);
    this();
    System.out.println("B");
  }
}
