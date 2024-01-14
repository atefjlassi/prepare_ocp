package example11;


public class A {

  <T> T m1(T a) {
    return null;
  }

  static <T> T m2(T a) {
    return a;
  }

  static <T> void smth(T a, Class<T> c) {
    // does smth
  }

  static <T> T getBean(String name, Class<T> c) {
    c.getFields();
    return null;
  }

  static Object getBean(String name) {
    return null;
  }

  public static void main(String[] args) throws ClassNotFoundException {
    smth(10, Integer.class);

    Double b1 = getBean("b1", Double.class);
    String b2 = getBean("b2", String.class);
    double d2 = (double) getBean("d2"); // classCastException
  }
}
