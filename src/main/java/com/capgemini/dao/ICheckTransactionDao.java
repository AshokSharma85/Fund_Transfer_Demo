package com.capgemini.dao;

public interface ICheckTransactionDao {

	boolean checkAmt(int username,double amount);
	void addBalanceDao(int username,int userid,double amount);
	 void displayTransactionDao(int username);
}
