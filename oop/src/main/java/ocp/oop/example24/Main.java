package ocp.oop.example24;

public class Main {

  public static void main(String[] args) {
    Pet p1 = new Cat();
    System.out.println(p1.name);

    // p1.sayMeow(); // CF: Pet class does not contain sayMeow() method.

    Cat c1 = new Cat();
    c1.sayMeow();
  }
}
