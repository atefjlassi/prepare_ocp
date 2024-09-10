package ocp.oop.example20;

public class Main {

  public static void main(String[] args) {

    A a1 = new B();
    a1.x= 6;
    // a1.y = "y"; CF: not accessible

    B b1 = (B) a1; // we just convert the reference, but the instance always the same and y is not missing
    b1.y = 4; // now its accessible

    // ((B) a1).y = 7; // its accessible here
    System.out.println(a1 == b1); // true


  }
}