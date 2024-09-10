package ocp.oop.example4;

public class Example1 {

  public static void main(String[] args) {

    /**
     * Overloading
     * should know, which method called ?
     */

    A a = new A();

    a.a(10); // call a(int x)
    a.a(12.3); // call a(double x)
    a.a((Long)13L); // call a(long x)
    a.a((int)18.0); // call a(int x)


    // a.a(null); // CF: Ambiguous method call. Both  a(String s) and a(Double d) match
    a.a((Double) null); // to avoid this problem explicit cast is needed

  }

}
