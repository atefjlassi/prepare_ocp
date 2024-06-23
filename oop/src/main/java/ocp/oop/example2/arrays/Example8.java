package ocp.oop.example2.arrays;

public class Example8 {

  public static void main(String[] args) {
    int [][] a = new int[][]{ {14}, {13,12}, {7}};

    for (int[] x : a) { // int[] x is the type of the items of a table
      // System.out.println(x.length);
      for (int y: x) {
        System.out.print(y +" ");
      }
      System.out.println();
    }
  }
}
