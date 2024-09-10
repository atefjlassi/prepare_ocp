package ocp.oop.example38;

public class Example {

  public static void main(String[] args) {
    Car car = new Car();
    Car.Engine e = car.new Engine();

    e.run();
    e.run();
    e.run();

    System.out.println(car.getX()); // 3
  }

}
