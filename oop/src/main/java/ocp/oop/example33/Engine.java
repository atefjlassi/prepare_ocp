package ocp.oop.example33;

public interface Engine {

  void run();

  // since java 8, we don't need a separate Class Factory to create instance (to implement Factory pattern)
  static Engine build(String type) {
    switch (type){
      case "electric": return new ElectricEngine();
      case "diesel": return new DieselEngine();
      default: throw new IllegalArgumentException();
    }
  }

}
