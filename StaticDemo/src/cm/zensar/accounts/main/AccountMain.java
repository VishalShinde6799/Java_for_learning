package cm.zensar.accounts.main;

import java.util.Scanner;
import cm.zensar.accounts.Account;

public class AccountMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("how many accounts do you want..?");
		int i=sc.nextInt();
		Account arr[]= new Account[i];
		
		
		for(int j=0; j<arr.length;j++)
		{
			System.out.println("Enter the owner's name");
			String owner= sc.next();
			System.out.println("enter balance::");
			Double balance=sc.nextDouble();
			arr[j]=new Account(owner, balance);
		}
			
		
		  Account a1= new Account(); float interestRate= Account.getInterestRate();
		  System.out.println("the interestrate is::" +interestRate);
		  System.out.println(a1.getAccNo());
		  System.out.println(a1);
		  Account a2= new Account("Prads", 200000.0);
		  System.out.println(a2.getAccNo());
		  System.out.println(a2);
		  
		  System.out.println("the total number of accounts is::"+Account.
		  getNoOfAccounts());
		 
		for(Account a:arr)
		{
				System.out.println(a);
		//a.PrintDetails();
		}
		
		
	}

}
