package com.zensar.enums;

public enum Expressions {
	
	SMILE, CRINGE, LAUGH, CRY, CUTIE;
	private int x;
	private Expressions()
	{
		x = 5;
	}
	private Expressions(int x)
	{
		this.x = x;
	}
	public void setcode(int x)
	{
		this.x = x;
	}
	public int getcode()
	{
		return x;
	}
	
}

