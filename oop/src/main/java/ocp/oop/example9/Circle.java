package ocp.oop.example9;

public class Circle extends Shape {

  // is-A relation : (in case of inheritance)
  // has-A relation : Owner has a Cat (in case of aggregation or composition)

  /**
   * add new fields
   * add new behaviour
   * change fields -> hiding fields = (not recommended in real life scenario).
   * change behaviour -> overriding
   */
  int radius;
  String area;

  void abc() {
    // accessible via super
    super.area = 5;
  }
}
