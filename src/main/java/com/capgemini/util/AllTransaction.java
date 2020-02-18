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
	Map<Integer,Users> copyOfUserMap=ToAddUser.user;
     
	public boolean checkAmount(int userName,double amount) 
	{	    boolean flag=true;
		return copyOfUserMap.get(userName).getWalletBalance()>=amount?flag:!flag;
		   
	}	
	List <Transaction> toStoreTransaction=new ArrayList<>();
	/*
	 * This method will add the appropriate details to arraylist 
	 */
	public void addBalance(int username,int userid,double amount)
	{   int transactionId=rand.nextInt(1000000);
	toStoreTransaction.add(new Transaction(username,userid,amount,transactionId,new Date()));
		double db=copyOfUserMap.get(username).getWalletBalance();
		db=db-amount;
		copyOfUserMap.get(username).setWalletBalance(db);
		double db1=copyOfUserMap.get(userid).getWalletBalance();
		db1+=amount;
		copyOfUserMap.get(userid).setWalletBalance(db1);
		System.out.println("Money Sent Successfully\n"
				+ "Rs "+amount+"\n"
						+ "Transaction Id "+transactionId);
	}
	
	public void displayTransaction(int username) {
		int count=0;
		for(int i=0;i<toStoreTransaction.size();i++)
		{
			Transaction data = toStoreTransaction.get(i);
			if(data.getSender()==username) 
			{System.out.println("-----------------------------------------------");
				System.out.println("Your Transaction Id: "+data.getTransactionId()+"\n"
						+ "Money Sent\n"
						+ "Rs "+data.getAmount()+"\n"
						+data.getDate()+"\n"
								+ "To: "+copyOfUserMap.get(data.getReceiver()).getUserName()+"("+data.getReceiver()+")");
				System.out.println("-----------------------------------------------");
			count++;
			}
			if(data.getReceiver()==username) {
				System.out.println("-----------------------------------------------");
				System.out.println("Your Transaction Id: "+data.getTransactionId()+"\n"
						+ "Money Received Rs "+data.getAmount()+"\n"
						+data.getDate()+"\n"
						+ "From: "+copyOfUserMap.get(data.getSender()).getUserName()+"("+data.getSender()+")");
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
