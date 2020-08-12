package com.zensar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate() {
		// TODO Auto-generated constructor stub
	day=month=1;
	year=2019;
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

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printdate()
	{
		System.out.println("the date is:" +day+"/"+month+"/"+year);
	}
	
	public String toString()
	{
		return day + "/" + month + "/" + year;
	}

}
