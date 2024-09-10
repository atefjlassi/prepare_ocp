package ocp.oop.example35;

public class Example2 {

  public static void main(String[] args) {
    Z z1 = () -> 5;
    Z z2 = () -> q();
    
    Z z3 = () -> {
      int e = 10;
      return e;
    };

    Z z4= () -> q();
    System.out.println(":)");
    int y = z4.m();
    System.out.println(y);
  }

  private static int q() {
    return 4;
  }
}
