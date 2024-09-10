package ocp.oop.example36;

public enum Seasons {
  SPRING,
  SUMMER,
  AUTUMN {
    @Override
    public void rains() {
      System.out.println(":D");
    }
  },
  WINTER;

  public void rains() {
    System.out.println(":)");
  }

  // public abstract void rains(); // should be implemented in all Enums
}
