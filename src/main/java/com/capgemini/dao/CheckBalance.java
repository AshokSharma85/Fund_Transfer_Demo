package com.capgemini.dao;

import com.capgemini.util.ToAddUser;

public class CheckBalance implements ICheckBalanceDao {
/*
 * This Class will be having the method to check the balance of bank and wallet of user  
 */
	ToAddUser objectOfToAddUser=new ToAddUser();
	/*
	 * balanceOfBank method will 
	 * */
	@Override
	public void balanceOfBank(int username)
	{
		objectOfToAddUser.bankBalance(username);
	}
	@Override
	public void balanceOfWallet(int username)
	{
		objectOfToAddUser.walletBalance(username);
	}
		
}
