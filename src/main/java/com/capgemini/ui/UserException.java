package com.capgemini.ui;

class AmountException extends Exception {
    
  AmountException(String message){
	  System.out.println(message);
  }
	
}
public class UserException  {

	 public static void checkAmount(double amount) throws AmountException {
	     if (amount<=0)
			throw new AmountException("Amount should be more than 0");
     }
}
