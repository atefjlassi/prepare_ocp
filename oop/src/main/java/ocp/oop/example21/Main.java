package ocp.oop.example21;

public class Main {

  public static void main(String[] args) {
    A a1 = new B();
    B b1 = (B) a1;

    // in both case we have the same instance,
    // but referring to the field acts differently depending on variable which refer
    a1.x = 7; // x declared in A class
    b1.x = "String"; // x declared in B class

    // conclusion: access to the field depends on the type of the (reference) NOT the type of the (instance).

    // when we discuss about methods it work the opposite way.
    // Eg: Always print B. why ? because always use the method of the type (m() of type B)
    a1.m(); // B
    b1.m(); // B


  }
}
