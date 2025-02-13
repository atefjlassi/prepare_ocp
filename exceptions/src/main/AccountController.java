package main;


import main.exceptions.TooMuchMoneyException;

public class AccountController {
  private static final double MAX_AMOUNT = 100;

  public void withdraw(double amount) throws TooMuchMoneyException {

    if(amount > MAX_AMOUNT) {
      // CF: should treat the exception locally or were the method is called
      throw new TooMuchMoneyException();
    }

    // do something
  }
}