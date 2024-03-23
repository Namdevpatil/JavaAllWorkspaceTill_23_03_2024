package com.ists.tasks;

public class StudentDetails 
{
	
	private int rollNo;
	private String name;
	private double marks;
	private String typeOfDegree;
	
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}

	public StudentDetails(int rollNo, String name, double marks, String typeOfDegree) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.typeOfDegree = typeOfDegree;
	}
	
	public void getStudent()
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(typeOfDegree);
	}


}
