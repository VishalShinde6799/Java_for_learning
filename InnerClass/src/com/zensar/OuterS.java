package com.zensar;

public class OuterS {
	private int a;
	public OuterS() {
		// TODO Auto-generated constructor stub
	a=100;
	}
	
	public void show()
	{
		System.out.println("the a:: "+a);
	}

	//static inner class
	
	 public static class InnerS
	{
		private int b;
		private static int c;
		
		static
		{
			c=500;
		}
		
		public InnerS()
		{
			b=200;
		}
		
		public void displayS()
		{
			System.out.println("InnerS b: "+b);
			System.out.println("InnerS c:"+c);
		}
	}
}
