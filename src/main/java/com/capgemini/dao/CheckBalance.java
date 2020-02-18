package com.capgemini.dao;

import com.capgemini.util.ToAddUser;

public class CheckBalance implements ICheckBalanceDao {

	ToAddUser objectOfToAddUser=new ToAddUser();
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
