package ccom.zensar.factorial.exception;

public class FactorialNotPossibleException extends Exception {
	
	private String errMessage;
	public FactorialNotPossibleException() {
		errMessage = "Factorial Not Possible For This Number";
	}
	public FactorialNotPossibleException(String errMessage) {
		super();
		this.errMessage = errMessage;
	}
	@Override
	public String toString() {
		return "FactorialNotPossibleException [errMessage=" + errMessage + "]";
	}
	public String getErrMessage() {
		return errMessage;
	}
	

}
