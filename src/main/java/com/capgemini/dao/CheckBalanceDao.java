package com.capgemini.dao;

import java.util.Map;

import com.capgemini.bean.Users;
import com.capgemini.util.ToAddUser;

public class CheckBalanceDao implements ICheckBalanceDao {
/*
 * This Class will be having the method to check the balance of bank and wallet of user  
 */
	ToAddUser objectOfToAddUser=new ToAddUser();
	Map<Integer, Users> users=objectOfToAddUser.userInfo();
	
	
	@Override
	public String balanceOfBank(int username)
	{
		return "Your Bank Balance is "+users.get(username).getBankAccountBalance();
	}
	@Override
	public String balanceOfWallet(int username)
	{  
		return "Your Wallet Balance is "+users.get(username).getWalletBalance();
	}
		
}
