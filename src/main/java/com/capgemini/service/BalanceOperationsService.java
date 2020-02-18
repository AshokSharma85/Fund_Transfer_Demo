package com.capgemini.service;

import com.capgemini.dao.CheckBalance;
import com.capgemini.dao.CheckTransaction;

public class BalanceOperationsService implements IBalanceOperationsService  {

	CheckBalance objectOfCheckBalance=new CheckBalance();
	CheckTransaction objectOfCheckTransaction=new CheckTransaction();

	@Override
	public void balanceOfWal(int username) {
		objectOfCheckBalance.balanceOfWallet(username);
	}
	@Override
	public void balanceOfBank(int username) {
		objectOfCheckBalance.balanceOfBank(username);
	}
	@Override
	public boolean checkWalletBalance(int username, double amount) {
		return objectOfCheckTransaction.checkAmt(username, amount);
	}
	@Override
	public void addBalanceService(int username, int userid, double amount) {
		objectOfCheckTransaction.addBalanceDao(username, userid, amount);
	}
	@Override
	public void displayTransactionService(int username) {
		objectOfCheckTransaction.displayTransactionDao(username);
	
	}
		
}
