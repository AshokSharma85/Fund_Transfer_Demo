package com.capgemini.service;

public interface IBalanceOperationsService {

	String balanceOfWal(int username);
	String balanceOfBank(int username);
	boolean checkWalletBalance(int username,double amount);
	void addBalanceService(int username,int userid,double amount);
	void displayTransactionService(int username);
}
