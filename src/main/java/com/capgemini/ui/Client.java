package com.capgemini.ui;

import java.util.Scanner;
import com.capgemini.service.ServiceClass;
import com.capgemini.validation.Validation;

public class Client {

	public static void main(String[] args)  {
		ServiceClass objectOfServiceClass=new ServiceClass();
		boolean varForFirstWhileLoop=true;
	    Scanner scannerVariable=new Scanner(System.in);
		System.out.println("*********************Welcome to Fund Transfer Application*****************");
		/*
		 * This while loop will be used to login into application and exit from application
		 */
	    while(varForFirstWhileLoop)
		{
			System.out.println("\nPress 1: To Login\n"
					+ "Press 2: To Exit");
			String input=scannerVariable.nextLine();
			switch(input)
			{
			case "1":
				String user;
				System.out.println("Please Enter Your UserId");
				while(true) {
				user=scannerVariable.nextLine();	
				 /*
				  * this boolean variable with validation will check whether the entered detail is having only number or not 
				  */				 
				 boolean validationOfUserName=Validation.check(user, Validation.pattern);
				 /*
				  * if this Write false then loop will break from here
				  */
				 if(!validationOfUserName)
				 {
					 System.out.println("Invalid User Id \n"
					 		+ "Please Enter Your User Id Again");
					 
				 }
				 else
				 {
					 break;
				 }
				}
				 /*
				  * After validating user we will convert that data into integer and store them in integer variable   
				  */
		         int username=Integer.parseInt(user);
		         System.out.println("Please Enter Your Password");
				 String password=scannerVariable.nextLine();
				 /*
				  * this if will call the validate function of Loginuser class and return boolean 
				  */
				 if(objectOfServiceClass.validate(username,password))
				 {
				/*
				 After login successfully this while loop will work till user do not want to logout 
				 */
					boolean varForSecondWhileLoop=true;
					while(varForSecondWhileLoop)
					{
						System.out.println("\nPress 1: To Check Wallet Balance\n"
								+ "Press 2:To Check Bank Balance\n"
								+ "Press 3:To see Transaction History \n"
								+ "Press 4:To Transfer Money\n"
								+ "Press 5:To Logout");
						/*
						 * to take input from user to perform this operations
						 */
						String insideInput=scannerVariable.nextLine();
						switch(insideInput)
						{
						case "1":
						/*
						 * This case will return the present amount of wallet  
						 */
							System.out.println(objectOfServiceClass.balanceOfWal(username));
							break;
						case "2":
							System.out.println(objectOfServiceClass.balanceOfBank(username));
							break;
						case "3":
							objectOfServiceClass.displayTransactionService(username);
							break;
						case "4":
							System.out.println("Enter Receiver's userId");
							String receiverId=scannerVariable.nextLine();
							boolean validationOfReceiverId=Validation.check(receiverId, Validation.pattern);
							if(!validationOfReceiverId)
							{  
								System.out.println("User Name should have only Numbers in UserName");	
								break;
							}
							int receiverIdOfUser=Integer.parseInt(receiverId);
							if(objectOfServiceClass.validateReceiver(receiverIdOfUser) && objectOfServiceClass.validateUserAndRecieverService(username,receiverIdOfUser))
							{
							System.out.println("Enter amount to be transfered");
							String amountToCheck=scannerVariable.nextLine();
							boolean validationOfAmount=Validation.check(amountToCheck, Validation.pattern);
							if(!validationOfAmount)
							{  
								System.out.println("Wrong Input!!\n"
										+ "Amount Should be greater than Zero having Numbers Only");	
								break;
							}
							double amount=Double.parseDouble(amountToCheck);
							try {
							UserException.checkAmount(amount);
							}
							catch(AmountException refOfException)
							{
								System.out.println(refOfException.getMessage());
								break;
							}
							if(objectOfServiceClass.checkWalletBalance(username, amount))
							{
								objectOfServiceClass.addBalanceService(username, receiverIdOfUser, amount);							
							}			    
							else
							{
							System.out.println("Insufficient Balance in Your Wallet to Transfer");	
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
					 System.out.println("Username or Password is Wrong!!");
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
