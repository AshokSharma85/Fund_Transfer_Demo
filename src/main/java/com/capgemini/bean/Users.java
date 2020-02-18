package com.capgemini.bean;

public class Users {

	private String userName;
	private String password;
	private String phoneNumber;
	private double bankAccountBalance;
	private double walletBalance;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return phoneNumber;
	}
	public void setMobileNo(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBankAccountBalance() {
		return bankAccountBalance;
	}
	public void setBankAccountBalance(double bankAccountBalance) {
		this.bankAccountBalance = bankAccountBalance;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + ", mobileNo=" + phoneNumber
				+ ", bankAccountBalance=" + bankAccountBalance + ", walletBalance=" + walletBalance +"\n]";
	}
	public Users(String userName, String password, String phoneNumber, double bankAccountBalance, double walletBalance) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.bankAccountBalance = bankAccountBalance;
		this.walletBalance = walletBalance;
	}
	
	
	
}
