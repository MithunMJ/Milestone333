package com.mindtree.StudentService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rollNo;
	private String name;
	private String gender;
	private int age;
	private long clg_id;
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
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
	public long getClg_id() {
		return clg_id;
	}
	public void setClg_id(long clg_id) {
		this.clg_id = clg_id;
	}
	public Student(long rollNo, String name, String gender, int age, long clg_id) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.clg_id = clg_id;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", age=" + age + ", clg_id="
				+ clg_id + "]";
	}

	
	
}
