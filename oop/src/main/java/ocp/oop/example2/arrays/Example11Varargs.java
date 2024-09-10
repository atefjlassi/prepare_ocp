package ocp.oop.example2.arrays;

public class Example11Varargs {

  public static void main(String[] args) {

    m();
    m(1);
    m(1, 3, 4);

    int [] b = {4, 6, 8};
    m(b); // it works fine
    // but
    // s(1, 2, 3); // CF be created before and then passing it to the method param: the table should

    // method signature with varargs => accept array in parameter
    // method signature with arrays => does not accept varargs as parameter

    /**
     *
     */

    m1(1, 2, 3);
    m2("ABC", 2, 5, 6);

    // ...

    int[] a = {1, 2, 3, 4, 5};
    m1(a); // m1(1,2,3,4,5);

    // ...
    int[] b1 = {1, 2, 3, 4, 5, 6};
    int[] b2 = {1, 2, 3, 4, 5, 6};

    int[][] c = {b1, b2};
    m3(c); // m3(b1,b2);
  }

  static void m(int... a) {
    int length = a.length;
    if (length > 0) {
      System.out.println(a[0]);
    }
  }

  static void s(int [] a) {
    int length = a.length;
    if (length > 0) {
      System.out.println(a[0]);
    }
  }

  /**
   *
   */

  static void m1(int... a) { // array with one dim -> vector
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  static void m2(String x, int... y) {
    System.out.println(x);
    System.out.println(y.length);
  }


  //  static void m3(int... [] x) CF, Wrong syntax
  static void m3(int[]... x) { // array of arrays -> matrix
    for (int[] a : x) {
      for (int b : a) {
        //
      }
    }
  }
}
