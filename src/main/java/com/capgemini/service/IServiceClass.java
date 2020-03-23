package com.capgemini.service;

public interface IServiceClass {

	String balanceOfWal(int username);
	String balanceOfBank(int username);
	boolean checkWalletBalance(int username,double amount);
	void addBalanceService(int username,int userid,double amount);
	void displayTransactionService(int username);
	
	boolean validate(int userName,String password);
	boolean validateReceiver(int username);
	boolean validateUserAndRecieverService(int username,int userid);
}
