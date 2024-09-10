package ocp.oop.example33;

public class EngineFactory {
  private EngineFactory() {
  }

  public static Engine build(String type) {
    switch (type){
      case "electric": return new ElectricEngine();
      case "diesel": return new DieselEngine();
      default: throw new IllegalArgumentException();
    }
  }
}
