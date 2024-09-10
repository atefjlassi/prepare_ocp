package ocp.oop.example38;

public class Car {

  private int x;
  class Engine {
    public void run() {
      Car.this.x++;
    }
  }
  public int getX() {
    return x;
  }

}
