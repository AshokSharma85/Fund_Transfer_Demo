package com.capgemini.service;

public interface IBalanceOperationsService {

	void balanceOfWal(int username);
	void balanceOfBank(int username);
	boolean checkWalletBalance(int username,double amount);
	void addBalanceService(int username,int userid,double amount);
	void displayTransactionService(int username);
}
