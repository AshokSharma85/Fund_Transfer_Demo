package com.capgemini.service;

import com.capgemini.dao.CheckBalanceDao;
import com.capgemini.dao.CheckLoginUserDao;
import com.capgemini.dao.CheckTransactionDao;

public class ServiceClass implements IServiceClass  {

	CheckBalanceDao objectOfCheckBalance=new CheckBalanceDao();
	CheckTransactionDao objectOfCheckTransaction=new CheckTransactionDao();
	CheckLoginUserDao objectOfCheckLoginUser=new CheckLoginUserDao();
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
		
	
	/*
	 * This method will check the username and password which is written by user after validation 
	 * if data is in collection then it will return true other it will written false
	*/
@Override
public boolean validate(int userName, String password) {
	return objectOfCheckLoginUser.checkLogin(userName,password);
	
}
	/*
	 * For transferring money if receiver user is present is not it will give result according to this in boolean
	*/
@Override
public boolean validateReceiver(int username) {

	return objectOfCheckLoginUser.checkReceiverDao(username);
}
/*
 *This method will check whether user is trying to send the money to himself/herself or not	 
 */
@Override
public boolean validateUserAndRecieverService(int userNameOfSender, int userNameOfReceiver) {
	return objectOfCheckLoginUser.validateUserAndRecieverDao(userNameOfSender,userNameOfReceiver);
}

}
