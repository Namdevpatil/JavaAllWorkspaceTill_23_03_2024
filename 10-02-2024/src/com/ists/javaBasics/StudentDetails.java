package com.ists.javaBasics;

public class StudentDetails
{

	private int rollNo;
	private String name;
	private double marks;
	private String typeOfDegree;
	
	public StudentDetails()//default constructor
	{
		rollNo=1234;
		name="katrina";
		marks=77.6;
		typeOfDegree="b.tech";
	}
	
	//parameterized constructor
	public StudentDetails(int rollNo, String name,double marks,String typeOfDegree)
	{
		this.rollNo=rollNo;
	    this.name=name;
	    this.marks=marks;
	    this.typeOfDegree=typeOfDegree;
	
	}
	public void getStudentDetails()
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(typeOfDegree);
	}
		
	
				
}	
	


