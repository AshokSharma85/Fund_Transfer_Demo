package com.capgemini.util;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.bean.Users;

public class ToAddUser {
	    
	static Map<Integer,Users> User=new HashMap<Integer,Users>();
	static {
		User.put(561236,new Users("Ashok","ask123","8974561236",10000,1500));
		User.put(562830,new Users("Sachin","Sac123","9874562830",20000,5890));
		User.put(841208, new Users("AJay","Ajay123","7956841208",15000,7890));
		User.put(523790,new Users("Ravi","rav123","7841523790",30000,1890));
		User.put(451203,new Users("Vivek","Viv123","9687451203",22000,8390));    
	}
	
	public boolean checkUserExistence(int username,String password)
	{
		if(User.containsKey(username))
		{ 
			String pass=User.get(username).getPassword();
			if(pass.equals(password))
				return true;	
		}
		return false;
	}
	
	public void walletBalance(int username)
	{
		System.out.println("Your Wallet Balance is " +User.get(username).getWalletBalance());
	}
	
	public void bankBalance(int username)
	{
		System.out.println("Your Bank Balance is "+User.get(username).getBankAccountBalance());
	}
	
	public boolean checkRec(int username)
	{
		if(User.containsKey(username))
		{
			return true;
		}
		return false;
	}
	
}
