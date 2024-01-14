package f.example.comparable;

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
  public String toString() {
    return "Cat{" +
      "age=" + age +
      '}';
  }

  @Override
  public int compareTo(Cat o) {

    return this.age - o.age;

  /*
    if (this.age==o.age)
      return 0;
    if (this.age < o.age)
      return -1;
    else
      return 1;
  */
  }
}
