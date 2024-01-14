package example10;

public class Example10 {

  public static void main(String[] args) {
    C<Integer> c1 = new C<>();
    C<String> c2 = new C<>();


    Integer q1 = c1.m1();
    c1.m2(10);

    String q2 = c2.m1();
    c2.m2(" :)");
  }

}
