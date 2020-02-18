package com.capgemini.util;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.bean.Users;

public class ToAddUser {
	    
	static Map<Integer,Users> user=new HashMap<>();
	static {
		user.put(561236,new Users("Ashok","ask123","8974561236",10000,1500));
		user.put(562830,new Users("Sachin","Sac123","9874562830",20000,5890));
		user.put(841208, new Users("AJay","Ajay123","7956841208",15000,7890));
		user.put(523790,new Users("Ravi","rav123","7841523790",30000,1890));
		user.put(451203,new Users("Vivek","Viv123","9687451203",22000,8390));    
	}
	
	public boolean checkUserExistence(int username,String password)
	{
		if(user.containsKey(username))
		{ 
			String pass=user.get(username).getPassword();
			if(pass.equals(password))
				return true;	
		}
		return false;
	}
	
	public void walletBalance(int username)
	{
		System.out.println("Your Wallet Balance is " +user.get(username).getWalletBalance());
	}
	
	public void bankBalance(int username)
	{
		System.out.println("Your Bank Balance is "+user.get(username).getBankAccountBalance());
	}
	
	public boolean checkRec(int username)
	{
		boolean flag=true;
		return user.containsKey(username)?flag:!flag;
		
	}
	
}
