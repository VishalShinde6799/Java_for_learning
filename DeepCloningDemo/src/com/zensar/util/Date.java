package com.zensar.util;

public class Date implements Cloneable {
	
	@Override
	public Date clone() throws CloneNotSupportedException {
		
		return (Date)super.clone();
	}

	private int day;
	private int month;
	private int year;
	
	public Date() {
		day=month=1;
		year=2020;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		
		return  day +"/"+month+"/"+year;
	}

	
}
