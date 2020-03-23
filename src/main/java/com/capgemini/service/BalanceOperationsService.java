package com.capgemini.service;

import com.capgemini.dao.CheckBalanceDao;
import com.capgemini.dao.CheckTransactionDao;

public class BalanceOperationsService implements IBalanceOperationsService  {

	CheckBalanceDao objectOfCheckBalance=new CheckBalanceDao();
	CheckTransactionDao objectOfCheckTransaction=new CheckTransactionDao();
    /*
     * This method will write the balance of wallet of user
     */
	@Override
	public String balanceOfWal(int username) {
		return objectOfCheckBalance.balanceOfWallet(username);
	}
	/*
     * This method will write the balance of account of user
     */
	@Override
	public String balanceOfBank(int username) {
		return objectOfCheckBalance.balanceOfBank(username);
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
