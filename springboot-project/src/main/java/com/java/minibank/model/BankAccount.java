package com.java.minibank.model;

public class BankAccount {

	private int balance;
	private int previousTransaction;
	private String userName;
	private String UserId;
	private String Password;
	private int deposit;
	private int withdraw;
	
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdrawal) {
		this.withdraw = withdrawal;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPreviousTransaction() {
		return previousTransaction;
	}
	public void setPreviousTransaction(int previousTransaction) {
		this.previousTransaction = previousTransaction;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
