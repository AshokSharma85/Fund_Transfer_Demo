package com.capgemini.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capgemini.bean.Transaction;
import com.capgemini.bean.Users;

public class AllTransaction {
	Random rand = new Random();
	Map<Integer,Users> hs=ToAddUser.User;
     
	public boolean checkAmount(int userName,double amount) 
	{		
		if(hs.get(userName).getWalletBalance()>=amount)
		    return true;	
		return false;	
	}
	
	
	List <Transaction> tr=new ArrayList<Transaction>();
	public void addBalance(int username,int userid,double amount)
	{   int transactionId=rand.nextInt(1000000);
		tr.add(new Transaction(username,userid,amount,transactionId,new Date()));
		double db=hs.get(username).getWalletBalance();
		db=db-amount;
		hs.get(username).setWalletBalance(db);
		double db1=hs.get(userid).getWalletBalance();
		db1+=amount;
		hs.get(userid).setWalletBalance(db1);
		System.out.println("Money Sent Successfully\n"
				+ "Rs "+amount+"\n"
						+ "Transaction Id "+transactionId);
	}
	
	public void displayTransaction(int username) {
		int count=0;
		for(int i=0;i<tr.size();i++)
		{
			Transaction data = tr.get(i);
			if(data.getSender()==username) 
			{System.out.println("-----------------------------------------------");
				System.out.println("Your Transaction Id: "+data.getTransactionId()+"\n"
						+ "Money Sent\n"
						+ "Rs "+data.getAmount()+"\n"
						+data.getDate()+"\n"
								+ "To: "+hs.get(data.getReceiver()).getUserName()+"("+data.getReceiver()+")");
				System.out.println("-----------------------------------------------");
			count++;
			}
			if(data.getReceiver()==username) {
				System.out.println("-----------------------------------------------");
				System.out.println("Your Transaction Id: "+data.getTransactionId()+"\n"
						+ "Money Received Rs "+data.getAmount()+"\n"
						+data.getDate()+"\n"
						+ "From: "+hs.get(data.getSender()).getUserName()+"("+data.getSender()+")");
				System.out.println("-----------------------------------------------");
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("No Transaction History");
		}
	}
}
