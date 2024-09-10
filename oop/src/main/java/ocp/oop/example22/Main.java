package ocp.oop.example22;

public class Main {

  public static void main(String[] args) {
    Animal a1 = new Cat();
    Animal a2 = new Dog();

    Cat c1 = new Cat();
    Animal a3 = c1; // no need for explicit cast: from more particular to more general

    Cat c2 = (Cat) a3; // need explicit cast: from more general to more particular
    Cat c3 = (Cat) a2; // compile fine, but at execution a ClassCastException happen. a2 does not correspond to a Cat

    // Cat c4 = (Cat) new Dog(); CF

    /**
     * Cat is an-animal
     * Dog is an-animal
     * No direct relationship
     */

  }
}