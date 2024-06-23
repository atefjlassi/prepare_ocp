package ocp.oop.example2.arrays;

public class Example6 {

  public static void main(String[] args) {

    final int [] a = {1, 2, 3, 4, 5}; // final mean cannot reassign a, but we still can change values inside
    a[0] = 6;


    final int [] x = {1,2,3,4,5};

    x[2] = 10;

    String [] y = {"A", "CB", "D"};

    int [][] z = { {1,2,3}, {2,5}, {1} };
    System.out.println("Z:" + z.length); // 3

    for (int i=0; i < z.length; i++) {
      System.out.println("Z["+i+"]:" + z[i].length); // int[]
    }
  }
}
