import java.util.Scanner;

class ArithmeticDemo
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	ArithmeticDemo d1= new ArithmeticDemo();
	System.out.println("enter a number, hit enter, feed another number, hit enter again");
	int n1= sc.nextInt();
	int n2= sc.nextInt();
	System.out.println("Enter a choice::\n 1.Add \n 2.Sub");
	String choice= sc.next();
	switch(choice)
	{
		case "Add" :
		System.out.println("the addition is:: ");
		d1.add(n1,n2);
		break;
	
		case "Sub" :
		System.out.println("the difference is:: ");
		d1.sub(n1,n2);
		break;
		
		default :
		System.out.println("Invalid choice");
		break;
	}
}
}