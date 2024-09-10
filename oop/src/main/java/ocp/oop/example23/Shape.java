package ocp.oop.example23;

/**
 * we can always create abstract class without must having an abstract method, (remove area() still compile fine).
 * so abstract class SHOULD NOT having an abstract method.
 * CANNOT use abstract with final modifier = DOESN'T make any sense
 */

// public final abstract class Shape: CF
public abstract class Shape {


    public Shape() { // it's possible to create constructor on an abstract class
    }
    public abstract double area();

    //  public  double area(){
    //    return 1;
    //  }

}