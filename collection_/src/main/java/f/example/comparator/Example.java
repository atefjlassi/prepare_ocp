package f.example.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * using compartor is another way Camparing Object. it's useful when I need to use multiple way of
 * comparing for the same object, or if I cannot modify the Object, it's an external way to
 * implement comparing objects.
 * <p>
 * With Comparable the method compareTo(Object obj), only needs one parameter because its always
 * implemented inside Class.
 *
 * With Comparator the method compare(Object obj1, Object obj2), needs two
 * parameters because its considerd outside the class always
 */
public class Example {

  public static void main(String[] args) {
    /*
    Comparable -> int compareTo(Dog o)
    Comparator<Dog> -> compare(Dog d1, Dog d2)
    */

    Comparator<Dog> c1 = (d1, d2) -> d1.getAge() - d2.getAge();
    Comparator<Dog> c2 = (d1, d2) -> d1.getName().compareTo(d2.getName());

    // using comparator with TreeSet is a MUST
    var set = new TreeSet<>(c2);

    set.add(new Dog("A", 3));
    set.add(new Dog("D", 2));
    set.add(new Dog("C", 1));
    set.add(new Dog("F", 6));

    set.forEach(System.out::println);

    // tricky situations
    // Collections vs Collection
    // Collection.sort() // does not compile !!!
    // Executor vs Executors
    // File vs Files

  }

}
