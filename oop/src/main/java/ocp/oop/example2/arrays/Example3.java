package ocp.oop.example2.arrays;

public class Example3 {

  public static void main(String[] args) {

    int[] x;
    // x = {}; NOT ALLOWED initialization
    x = new int[5];

    int[] y1 = {}; // length 0
    int[] y2 = {1, 8, 9};

    int[] w1;
    // int [] w2 = new int[8] {0,3,6,9,8}; // CF should not specify the length in this way

    var z = new int[8];
    // var z2 = {8}; cannot use var with this declaration


    m(z);
    m(new int[8]);
    // m({1,8,9}); CF, not possible
    m(new int[] {4, 6, 9});
  }

  private static void m(int [] z) {
  }

  // private static void m1(var z) { // not possible
  // }
}
