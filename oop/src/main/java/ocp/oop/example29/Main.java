package ocp.oop.example29;

public class Main {
  public static void main(String[] args) {

    /**
     * now instead of using marker interface we use annotation
     * how to parse an interface using reflection ?
     */
    B b = new B();
    if (b instanceof A) {
      System.out.println("A");
    }
  }
}
