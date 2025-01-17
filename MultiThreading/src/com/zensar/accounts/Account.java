package com.zensar.accounts;

public class Account {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
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

	public void withdraw(double amount) throws InterruptedException
	{
		System.out.println("start of withdraw");
		synchronized (this) {
			
			//Wait and notify methods are called inside synchronized block preferably.
			double currentBalance = getBalance();
			System.out.println("before withdrawal, BAlance viewed by: " + Thread.currentThread().getName() + " is "
					+ currentBalance);
			currentBalance = currentBalance - amount;
			System.out.println(Thread.currentThread().getName() +" Withdrawed "+amount);
			Thread.sleep(1000);
			setBalance(currentBalance);
			currentBalance = getBalance();
			System.out.println("After withdrawal, BAlance viewed by: " + Thread.currentThread().getName() + " is "
					+ currentBalance);
//			System.out.println("After withdrawal, BAlance viewed by: " + Thread.currentThread().getId() + " is "
//					+ currentBalance);
//			System.out.println("After withdrawal, BAlance viewed by: " + Thread.currentThread().getPriority() + " is "
//					+ currentBalance); 
		}
		System.out.println("end of withdrawal");

	}

	
}
