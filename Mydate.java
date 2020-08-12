/*
@author vishal shinde
@creation_date 10/12/2019
@version 1.0
*/

class Mydate
{
private int day;
private int month;
private int year;

	Mydate()
	{
		this(10,12,1991);
		//day= month=-1;
		//year=1973;
	
	}
	/************************************/
	public void setDay(int day)
	{
		this.day=day;
	}
	
	public void setMonth(int m)
	{
		this.month=month;
	}
	
	public void setYear(int y)
	{
		this.year=year;
	}
	/*****************************************/
	public int getYear()
	{return year;}
	
	public int getDay()
	{return day;}
	
	public int getMonth()
	{return month;}
    /*****************************************/
// parameterized constructor
	Mydate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public void initDate()
	{
		day= month=1;
		year=2019;	
	}
	
	public void printDate()
	{
		System.out.println("Date: " +day+ "/" +month +"/" +year);	
	}
}

class DateDemo
{
	public static void main(String args[])
	{
		Mydate d= new Mydate();
		Mydate d1= new Mydate(1,2,3);
		
		System.out.println("Date 1:");
		d.printDate();
		d.initDate();
		d.printDate();
		
		System.out.println("Date 2:");
		d1.printDate();
		d1.initDate();
		d1.printDate();
		System.out.println("After using setter and getter methods::\n");
		d1.setDay(15);
		d1.printDate();
		System.out.println(d1.getYear());
	}
}
