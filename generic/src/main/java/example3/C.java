package example3;

public class C<N extends Number> {


  public void doSomething(N n) {
    long l = n.longValue();
    System.out.println(l);
  }
}
