package com.javaSerializationAndDeSerialization;

import java.io.Serializable;

public class Student implements Serializable
{

	private static final long serialVersionUID = 17890L;
	
	//fields
	private int studentId;
	private String studentName;
	private float studentMarks;
	private long contactNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, float studentMarks, long contactNo) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.contactNo = contactNo;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", contactNo=" + contactNo + "]";
	}	
	
}
