package ocp.oop.example36;

// enum are particular class
public enum Coffee {
  // SMALL, MEDIUM, BIG:  Are static

  SMALL(20), MEDIUM, BIG; // this is always first in an enum (syntactic rule)
  private int qty;

  private Coffee() { // private by default, cannot make it public (CF)
    System.out.println(":)");
  }

  Coffee(int qty) {
    this.qty = qty;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
}



// how enums looks like with normal classes

//public final class Coffee   {
//
//  public static final Coffee SMALL = new Coffee();
//  public static final Coffee MEDIUM = new Coffee();
//  public static final Coffee BIG = new Coffee();
//
//  private Coffee() {
//  }
//}