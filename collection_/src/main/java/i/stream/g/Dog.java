package i.stream.g;

import java.util.Comparator;

public class Dog {
  public int age;

  public Dog(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Dog{" +
      "age=" + age +
      '}';
  }
}
