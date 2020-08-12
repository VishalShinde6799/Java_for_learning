package com.zensar.students;

import com.zensar.util.Date;

public class Student {
	private int rollNo;
	private String name;
	private float percentage;
	
	//containment
	private Date birthDate;
	
	public Student() {
		rollNo=1;
		name="abc";
		percentage=35.00f;
		
	}

	public Student(int rollNo, String name, float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}


}
