package ocp.oop.example7;

public class Main {
  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.setName("Tom");
    //    cat.name = "Tom";
    //    cat.age = 20;
    //    System.out.println(cat.name);


    // NB: by using method we can intercept changes through entreprise framework (aop, spring) but we cannot intercept property
    // + why we use method to change properties
    // smart getters and smart setters are not the best choice (multiple responsibilities)
  }
}
