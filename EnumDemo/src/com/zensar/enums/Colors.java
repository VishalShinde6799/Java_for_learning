package com.zensar.enums;

public enum Colors  {
	
	RED(10),GREEN(12),BLUE(),PURPLE,MAGENTA,PINK(100);
	
	private int code;
	private Colors() {
		code= -1;
		System.out.println("Default of Colors");
	}
	private Colors(int code) {
		this.code = code;
		System.out.println("para. of Colors");
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	

}
