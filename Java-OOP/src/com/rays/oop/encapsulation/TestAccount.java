package com.rays.oop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(10000.00);
		System.out.println("Total Balance = " + a.getBalance());
		a.setAccountType("Saving Account");
		System.out.println("Account Type = " + a.getAccountType());
		a.setAccountNumber("AABBCCDD1234");
		System.out.println("Account Number = " + a.getAccountNumber());
		System.out.println("-----------------------------------");
		a.deposit(1500.50);
		System.out.println("Total Amount after deposit = " + a.getBalance());
		a.withdrawal(500.50);
		System.out.println("Total Amount after withdrawal = " + a.getBalance());
		a.fundTransfer(1000);
		System.out.println("Total Amount after fund transfer = " + a.getBalance());
		a.payBill(500);
		System.out.println("Total Amount after paying bill = " + a.getBalance());
		
		System.out.println("Final Amount = " + a.getBalance());
	}
	

}
