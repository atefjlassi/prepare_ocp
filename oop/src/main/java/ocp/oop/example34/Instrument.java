package ocp.oop.example34;

@FunctionalInterface
public interface Instrument {
  void play();

  default void m() {
  }

  static void m2() {
  }

}
