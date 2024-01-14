package i.stream.g;

public class Cat implements Comparable<Cat> {
  private int age;

  public Cat(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int compareTo(Cat o) {
    return this.getAge() - o.getAge();
  }
}
