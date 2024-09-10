package ocp.oop.example25;

public class Main {

  public static void main(String[] args) {
    Playable p = new Piano();
    p.play();

    Piano p1 = (Piano) p;
    System.out.println(p1.y);
  }
}
