package ocp.oop.example24;

// abstract class mean that the class is not complete, and need to be inherited to be completed
public abstract class Pet {

  protected String name;

//  public Pet() {
//  }

  // cannot call it from outside : new Pet("Tom") ||  but we can use it: super("Tom")
  public Pet(String name) {
    this.name = name;
  }
}
