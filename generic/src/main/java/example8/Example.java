package example8;

public class Example {

  public static void main(String[] args) {
    B<String> b = new B<>();

    b.a = "string";
    b.b = "string 2";

    B<Double> d2 = new B<>();
    d2.a = 2.3;
    d2.b = "hello";
  }
}
