package com.capgemini.ui;

@SuppressWarnings("serial")
class AmountException extends Exception {

  AmountException(String message){
	  super(message);	 
  }
	
}
public class UserException  {

	 public static void checkAmount(double amount) throws AmountException {
	     if(amount<=0)
			throw new AmountException("Amount should be more than 0");
     }
}