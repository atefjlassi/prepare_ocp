package ocp.oop.example42;

public class Example {

  public static void main(String[] args) {
    Instrument i1 = new Instrument() { // implements
      @Override
      public void play() {
        System.out.println("Playing");
      }
    };

    Instrument i2 = () -> System.out.println("Lambda playing");

    i1.play();
    i2.play();
  }

}
