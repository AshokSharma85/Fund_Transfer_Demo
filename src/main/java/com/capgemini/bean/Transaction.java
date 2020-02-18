package com.capgemini.bean;

import java.util.Date;

public class Transaction {

	private int sender;
	private int receiver;
	private double amount;
	private int transactionId;
    private Date date;
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Transaction(int sender, int receiver, double amount, int transactionId, Date date) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
		this.transactionId = transactionId;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [sender=" + sender + ", receiver=" + receiver + ", amount=" + amount + ", transactionId="
				+ transactionId + ", date=" + date + "]";
	}

}
