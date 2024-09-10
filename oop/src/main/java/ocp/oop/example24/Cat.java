package ocp.oop.example24;

public class Cat extends Pet {

  public Cat() {
    super("Tom");
  }
  public void sayMeow() {
    System.out.println("Meow ! My name " + this.name);
  }
}
