package com.zensar;

public class OuterMl {
	private int a;
	public OuterMl() {
	
		// TODO Auto-generated constructor stub
	a=25;
	}
	public void show()
	{
		System.out.println("methodml a: "+a);
		
		class InnerMl
		{
			private int b;
			public InnerMl() {
				// TODO Auto-generated constructor stub
				b=35;
			}
			
			public void diss()
			{
				System.out.println("inner ml b: "+b);
			}
		}//end of innnnnnnnnnnnnnnnnerMl
		
		InnerMl in = new InnerMl();
		in.diss();
	}//end of OuuuuuuuuuuuuuuuterMl

}
