package com.capgemini.service;

public interface IBalanceOperationsService {

	void BalanceWal(int username);
	void BalanceBank(int username);
	boolean checkWalletBalance(int username,double amount);
	void addBalanceService(int username,int userid,double amount);
	void displayTransactionService(int username);
}
