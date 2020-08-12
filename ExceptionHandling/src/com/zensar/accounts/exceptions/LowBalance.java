package com.zensar.accounts.exceptions;

public class LowBalance extends Exception 
{
	private String errMessage;
	
	public LowBalance() {
	errMessage= "low balance";
		
	}

	public LowBalance(String errMessage) {
		super();
		this.errMessage = errMessage;
	}

	@Override
	public String toString() {
		return "LowBalance [errMessage=" + errMessage + "]";
	}

	public String getErrMessage() {
		return errMessage;
	}
	
	
	

}
