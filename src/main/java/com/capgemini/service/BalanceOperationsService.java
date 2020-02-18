package com.capgemini.service;

import com.capgemini.dao.CheckBalance;
import com.capgemini.dao.CheckTransaction;

public class BalanceOperationsService implements IBalanceOperationsService  {

	CheckBalance objectOfCheckBalance=new CheckBalance();
	CheckTransaction objectOfCheckTransaction=new CheckTransaction();
    /*
     * This method will write the balance of wallet of user
     */
	@Override
	public void balanceOfWal(int username) {
		objectOfCheckBalance.balanceOfWallet(username);
	}
	/*
     * This method will write the balance of account of user
     */
	@Override
	public void balanceOfBank(int username) {
		objectOfCheckBalance.balanceOfBank(username);
	}
	/*
	 * This will check if the money which user is wanting to send to other user is there in his/her wallet or not 
	 */
	
	@Override
	public boolean checkWalletBalance(int username, double amount) {
		return objectOfCheckTransaction.checkAmt(username, amount);
	}
	/*
	 *This method will add the amount to another account and deduct the amount from sender's wallet 
	  */
	@Override
	public void addBalanceService(int username, int userid, double amount) {
		objectOfCheckTransaction.addBalanceDao(username, userid, amount);
	}
	
	 /*
	 *This method will show the transction history if there is ay transaction
	 */
	
	@Override
	public void displayTransactionService(int username) {
		objectOfCheckTransaction.displayTransactionDao(username);
	
	}
		
}
