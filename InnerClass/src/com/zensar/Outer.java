package com.zensar;
//outer (must be public or default)
public class Outer {
	private int i;
	public Outer() {
		i=10;
	}

	public void show()
	{
		System.out.println("the outer value is:: "+i);
	}
	//inner (regular inner, instance inner or non-static inner. can be public. protec. private, default, final etc)
	//no statics allowed in inner class because inner class itself is an instance.
	public class Inner
	{
		private int j;
		public Inner() {
			j=20;
		}
		public void display()
		{
			System.out.println("inner variable value is:: "+j);
			System.out.println("outer variable in inner is: "+i);
		}
	}//end of inner
	
}//end of outer
