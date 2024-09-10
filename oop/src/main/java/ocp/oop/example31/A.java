package ocp.oop.example31;

public interface A {

  default void m() {
    System.out.println("common behaviour for any class implement A");
  }
}
