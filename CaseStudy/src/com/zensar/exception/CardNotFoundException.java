package com.zensar.exception;

public class CardNotFoundException extends Exception
{
	String errmsg;
	public CardNotFoundException() 
	{
		errmsg="CardNotFoundException";
	}
	
	public CardNotFoundException(String errmsg) 
	{
		super();
		this.errmsg = errmsg;
	}

	public String getErrmsg() 
	{
		return errmsg;
	}
	@Override
	public String toString() {
		return "CardNotFoundException [errmsg=" + errmsg + "]";
	}	

}
