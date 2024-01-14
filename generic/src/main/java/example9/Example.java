package example9;

public class Example {

  public static void main(String[] args) {

    B<Integer, String> b = new B<>();

    // reverse the order
    b.a = "string";
    b.b = 1;

    A<Integer, String> b_ = new B<String, Integer>();
    A<? extends Number, ?> a1 = new B<String, Double>();

  }

}
