package ocp.oop.example41;

public class Example {

  public static void main(String[] args) {
    int x = 10; // effectively final
    Cat c1 = new Cat() {
      @Override
      public void sayMeow() {
        System.out.println("Meow! Meow! "+ x);
      }
    };

    c1.sayMeow();

    Cat c2 = new Cat();
    /**
     * class ocp.oop.example41.Cat
     * class ocp.oop.example41.Example$1
     */
    System.out.println(c2.getClass());
    System.out.println(c1.getClass());
  }
}
