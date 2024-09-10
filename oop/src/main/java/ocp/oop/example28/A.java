package ocp.oop.example28;

public class A {

  // just keep responsibilities couples not the implementation.
  ContractOfB b = new B();
  public void functionalityOfA() {
    // does something here
    b.partOfWhatBHasToDo();
    // does something here
  }
}
