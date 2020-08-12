package com.zensar.accounts;

import com.zensar.accounts.exceptions.LowBalance;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		accNo=0;
		ownerName="abc";
		balance=10000;
	}
	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	public void withdraw(double amount) throws LowBalance
	{
		if(amount>(balance-1000.0))
			throw new LowBalance("sorry, cannot withdraw");
		else
			balance= balance-amount;
		System.out.println("amount withdrowed is::" +amount);
	}
	
	
}
