package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.BalanceOperationsService;
import com.capgemini.service.LoginUserService;
import com.capgemini.validation.Validation;

public class Client {

	public static void main(String[] args) throws AmountException  {
		BalanceOperationsService objectOfBalanceOperations=new BalanceOperationsService();
		boolean varForFirstWhileLoop=true;
	    Scanner scannerVariable=new Scanner(System.in);
	    LoginUserService objectOfLoginUser=new LoginUserService();
		System.out.println("*********************Welcome to Fund Transfer Application*****************");
	    while(varForFirstWhileLoop)
		{
			System.out.println("\nPress 1: To Login\n"
					+ "Press 2: To Exit");
			String input=scannerVariable.next();
			switch(input)
			{
			case "1":
				 System.out.println("Please Enter Your UserId");
				 String user=scannerVariable.next();	
				 boolean validationOfUserName=Validation.check(user, Validation.pattern);
				 if(validationOfUserName==false)
				 {
					 System.out.println("Please Enter Valid User Id");
					 break;
				 }
		         int username=Integer.parseInt(user);
		         System.out.println("Please Enter Your Password");
				 String password=scannerVariable.next();
				 if(objectOfLoginUser.validate(username,password))
				 {
					boolean varForSecondWhileLoop=true;
					while(varForSecondWhileLoop)
					{
						System.out.println("\nPress 1: To Check Wallet Balance\n"
								+ "Press 2:To Check Bank Balance\n"
								+ "Press 3:To see Transaction History \n"
								+ "Press 4:To Transfer Money\n"
								+ "Press 5:To Logout");
						String insideInput=scannerVariable.next();
						switch(insideInput)
						{
						case "1":
							objectOfBalanceOperations.BalanceWal(username);
							break;
						case "2":
							objectOfBalanceOperations.BalanceBank(username);
							break;
						case "3":
							objectOfBalanceOperations.displayTransactionService(username);
							break;
						case "4":
							System.out.println("Enter Receiver's userId");
							String receiverId=scannerVariable.next();
							boolean validationOfReceiverId=Validation.check(receiverId, Validation.pattern);
							if(!validationOfReceiverId)
							{  
								System.out.println("User Name should have only Numbers in UserName");	
								break;
							}
							int receiverIdOfUser=Integer.parseInt(receiverId);
							if(objectOfLoginUser.validateReceiver(receiverIdOfUser) && objectOfLoginUser.validateUserAndRecieverService(username,receiverIdOfUser))
							{
							System.out.println("Enter amount to be transfered");
							String amountToCheck=scannerVariable.next();
							boolean validationOfAmount=Validation.check(amountToCheck, Validation.pattern);
							if(!validationOfAmount)
							{  
								System.out.println("Wrong Input!!\n"
										+ "Amount Should be greater than Zero");	
								break;
							}
							double amount=Double.parseDouble(amountToCheck);
							try {
							UserException.checkAmount(amount);
							}
							catch(AmountException e)
							{
								e.getMessage();
								break;
							}
							if(objectOfBalanceOperations.checkWalletBalance(username, amount))
							{
								objectOfBalanceOperations.addBalanceService(username, receiverIdOfUser, amount);							
							}			    
							else
							{
							System.out.println("Insufficient Balance");	
							}
							}
							else
							{
								System.out.println("User does not Exists to Transfer Money");
							}
							break;
						case "5":
							varForSecondWhileLoop=false;
							System.out.println("Logout SuccessFully\n");
							break;
						default:
							System.out.println("Please Enter Correct Input");
						}
					}
				 }
				 else
				 { 
					 System.out.println("Invalid User");
				 }
				break;
			case "2":
				varForFirstWhileLoop=false;
				System.out.println("Exit SuccessFully");
				break;
				
			default :
				System.out.println("Please Enter Correct Input");
			}
			
			
		}
	    scannerVariable.close();
	}

}
