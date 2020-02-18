package com.capgemini.bean;

import java.util.Date;

public class Transaction {

	private int Sender;
	private int Receiver;
	private double Amount;
	private int TransactionId;
    private Date Date;
    private String Description;
	public int getSender() {
		return Sender;
	}
	public void setSender(int sender) {
		Sender = sender;
	}
	public int getReceiver() {
		return Receiver;
	}
	public void setReceiver(int receiver) {
		Receiver = receiver;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Transaction(int sender, int receiver, double amount, int transactionId, java.util.Date date) {
		super();
		Sender = sender;
		Receiver = receiver;
		Amount = amount;
		TransactionId = transactionId;
		Date = date;
	}
	@Override
	public String toString() {
		return "Transaction [Sender=" + Sender + ", Receiver=" + Receiver + ", Amount=" + Amount + ", TransactionId="
				+ TransactionId + ", Date=" + Date + "]";
	}
    
}
