package ocp.oop.example25;

public class Piano implements Playable {

  int y;
  @Override
  public void play() { // MUST BE PUBLIC
    System.out.println("Play !");
  }
}
