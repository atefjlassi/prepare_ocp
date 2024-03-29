package g.example.maps;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

  int age;

  public Cat(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return age == cat.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age);
  }

  @Override
  public int compareTo(Cat o) {
    return this.age - o.age;
  }
}
