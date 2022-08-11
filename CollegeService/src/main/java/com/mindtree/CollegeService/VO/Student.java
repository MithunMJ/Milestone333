package com.mindtree.CollegeService.VO;

public class Student 
{
	private int rollNo;
	private String name;
	private String gender;
	private int age;
	private long clgId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getClgId() {
		return clgId;
	}
	public void setClgId(long clgId) {
		this.clgId = clgId;
	}
	public Student(int rollNo, String name, String gender, int age, long clgId) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.clgId = clgId;
	}
	public Student() {
		super();
	}
	
	

}
