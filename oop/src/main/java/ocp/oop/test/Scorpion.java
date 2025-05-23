package ocp.oop.test;


class Arachnid {

  static StringBuilder sb = new StringBuilder();

  {
    sb.append("c");
  }

  static {
    sb.append("u");
  }

  {
    sb.append("r");
  }
}

public class Scorpion extends Arachnid {
  static {
    sb.append("q");
  }
  {
    sb.append("m");
  }
  public static void main(String[] args) {
    System.out.print(Scorpion.sb + " ");
    System.out.print(Scorpion.sb + " ");
    System.out.println("*");
    new Arachnid();
    new Scorpion();
    System.out.print(Scorpion.sb);
  }
}
