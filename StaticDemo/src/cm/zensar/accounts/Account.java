package cm.zensar.accounts;

//import cm.zensar.accounts.main.*;

public class Account {
	
	
	private long accNo;
	private String ownerName;
	private double balance;
	//static member of the class. 
	//single copy is shared among all the objects of the same class
	private static float interestRate;
	private static long count;
	private static long noOfAccounts;
	
	public static long getNoOfAccounts() {
		return noOfAccounts;
	}

	static
	{
		System.out.println("this is block 1");
		interestRate= 0.09f;
	}
	
	static
	{
		count= 12020020000000000l;
		System.out.println("this is the second static init block");
	}
	
	{
		System.out.println("instance init block 1");
	}
	
	{
		System.out.println("instance init block 2");
	}
	public Account() {
		count++;
		accNo=count;
		noOfAccounts++;
		System.out.println("\ndefault constructor\n");
		/*
		 * ownerName="Pandu"; balance=10000.00;
		 */
	}

	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
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

	public Account(String ownerName, double balance) {
		this();
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("\nParameterized constructor\n");
	}
	
	public void PrintDetails()
	{
		System.out.println("the account no. is:"+accNo);
		System.out.println("the owner's name is::"+ownerName);
		System.out.println("the balance is::"+balance);
	}
	public String toString()
	{
		return "ACCOUNT NO::" + accNo +
				"\tOWNER NAME:"+ ownerName +
				"\tBALANCE:" + balance ;
	}

}
