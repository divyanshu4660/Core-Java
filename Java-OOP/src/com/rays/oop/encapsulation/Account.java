package com.rays.oop.encapsulation;

public class Account {
	private double balance;
	private String accountType;
	private String accountNumber;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String number) {
		this.accountNumber = number;
	}

	public double deposit(double amt) {

		return this.balance = this.balance + amt;

	}

	public double withdrawal(double amt) {

		return this.balance = this.balance - amt;

	}
	public double fundTransfer(double amt) {

		return this.balance = this.balance - amt;

	}
	public double payBill(double amt) {

		return this.balance = this.balance - amt;

	}

}
