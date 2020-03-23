package com.capgemini.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capgemini.bean.Transaction;
import com.capgemini.bean.Users;
import com.capgemini.util.AllTransaction;
import com.capgemini.util.ToAddUser;

public class CheckTransactionDao implements ICheckTransactionDao{

	AllTransaction objectOfAllTransaction=new AllTransaction();
	ToAddUser objectOfToAddUser=new ToAddUser();
	Map<Integer, Users> users=objectOfToAddUser.userInfo();
	Random rand = new Random();
	
	List<Transaction> showTransactionList=objectOfAllTransaction.listInfo();
	
	@Override
	public boolean checkAmt(int userName, double amount) {
		 boolean flag=true;
		return users.get(userName).getWalletBalance()>=amount?flag:!flag;
			   
	}

	/*
	 * This method will add the appropriate details of transaction into arraylist  
	 */
	@Override
	public void addBalanceDao(int sender, int receiver, double amount) {
		
		 int transactionId=rand.nextInt(1000000);
		 showTransactionList.add(new Transaction(sender,receiver,amount,transactionId,new Date()));
				double db=users.get(sender).getWalletBalance();
				db=db-amount;
				users.get(sender).setWalletBalance(db);
				double db1=users.get(receiver).getWalletBalance();
				db1+=amount;
				users.get(receiver).setWalletBalance(db1);
				System.out.println("Money Sent Successfully\n"
						+ "Rs "+amount+"\n"
								+ "Transaction Id "+transactionId);
	}

	@Override
	public void displayTransactionDao(int username) {
		int count=0;
		/*
		 * This for loop will show the transaction History
		 */
		for(int i=0;i<showTransactionList.size();i++)
		{
			Transaction data = showTransactionList.get(i);
			if(data.getSender()==username) 
			{System.out.println("-----------------------------------------------");
				System.out.println("Your Transaction Id: "+data.getTransactionId()+"\n"
						+ "Money Sent\n"
						+ "Rs "+data.getAmount()+"\n"
						+data.getDate()+"\n"
								+ "To: "+users.get(data.getReceiver()).getUserName()+"("+data.getReceiver()+")");
				System.out.println("-----------------------------------------------");
			count++;
			}
			if(data.getReceiver()==username) {
				System.out.println("-----------------------------------------------");
				System.out.println("Your Transaction Id: "+data.getTransactionId()+"\n"
						+ "Money Received Rs "+data.getAmount()+"\n"
						+data.getDate()+"\n"
						+ "From: "+users.get(data.getSender()).getUserName()+"("+data.getSender()+")");
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
