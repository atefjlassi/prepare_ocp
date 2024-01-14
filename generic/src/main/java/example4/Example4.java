package example4;

public class Example4 {

  public static void main(String[] args) {
    E<String, Integer> d1 = new E<>();
    E<String, Integer> d2 = new E<String, Integer>();
    E<?, Integer> d3 = new E<String, Integer>();
    E<?, ? extends Number> d4 = new E<String, Integer>();


  }
}
