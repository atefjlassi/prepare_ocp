package main;

import main.exceptions.MyCheckedException;
import main.exceptions.MyRuntimeException;
import main.exceptions.TooMuchMoneyException;

public class B extends A{

  @Override
  public void m() {
    // throws Exception { CF: because it covers more than the listed checked exception in the parent class
  }


}
