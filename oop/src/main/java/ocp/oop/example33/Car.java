package ocp.oop.example33;

public class Car {

  private Engine engine;
  public Car() {
    this.engine = EngineFactory.build("electric");
  }
}
