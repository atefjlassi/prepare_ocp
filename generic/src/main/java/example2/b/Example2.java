package example2.b;

public class Example2 {

  public static void main(String[] args) {
//     B<? extends Number> b1 = new B<>();   -> CF  b1.a = 10;
//    B<?> b1 = new B<>(10); -> CF:    b1.a = 10;
//    B<? super Number> b1 = new B<>(10); -> OK

    B<? extends Number> b1 = new B<>(10);
    B<? super Number> b2 = new B<>(10.5);

    System.out.println(b1.a.getClass());
    System.out.println(b1.a);

    System.out.println(b2.a.getClass());
    System.out.println(b2.a);


  }
}
