package ocp.oop.example31;

public interface B {
  default void m() {
    System.out.println("common behaviour for any class implement B");
  }
}
