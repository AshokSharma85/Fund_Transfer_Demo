package com.capgemini.dao;

import com.capgemini.util.AllTransaction;

public class CheckTransaction implements ICheckTransactionDao{

	AllTransaction objectOfAllTransaction=new AllTransaction();
	
	@Override
	public boolean checkAmt(int username, double amount) {
		return objectOfAllTransaction.checkAmount(username,amount);
	}

	@Override
	public void addBalanceDao(int username, int userid, double amount) {
		objectOfAllTransaction.addBalance(username, userid, amount);
	}

	@Override
	public void displayTransactionDao(int username) {
		objectOfAllTransaction.displayTransaction(username);
	}
	
}
