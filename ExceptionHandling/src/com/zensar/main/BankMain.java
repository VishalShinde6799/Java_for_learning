package com.zensar.main;

import java.util.Scanner;

import com.zensar.accounts.Account;
import com.zensar.accounts.exceptions.LowBalance;

public class BankMain {

	public static void main(String[] args) {
		Account ac = new Account(123456789,"baban", 10000.0);
		System.out.println(ac);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter withdrawal amount");
		double amt= sc.nextDouble();
		System.out.println("balance before withdrawal::"+ac.getBalance());
		try {
		ac.withdraw(amt);
		System.out.println("balance after withdrawal::"+ac.getBalance());
		}
		catch(LowBalance e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
