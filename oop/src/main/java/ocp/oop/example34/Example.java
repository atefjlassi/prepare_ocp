package ocp.oop.example34;

public class Example {
  public static void main(String[] args) {

    Instrument i = () -> System.out.println(":)");

    i.play();
  }
}
