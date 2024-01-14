package h.functional.lambda.example1;

public class Example1 {

  public static void main(String[] args) {
    Eatable eatable = new Eatable() {
      @Override
      public void eat() {
        System.out.println("hey !");
      }
    };

    Eatable eatable_ = () -> System.out.println("Hey !");

    eatable.eat();
    eatable_.eat();

  }

}
