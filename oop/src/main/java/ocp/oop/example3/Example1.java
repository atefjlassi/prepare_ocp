package ocp.oop.example3;

import ocp.oop.example3.Cat;

//NB: not recommended to use anonymous class on real life
public class Example1 {

  public static void main(String[] args) {

    // see the order of calling static and none static blocs
    new Cat();
    new Cat();
    new Cat();

//    Cat.sayMeow();
  }
}
