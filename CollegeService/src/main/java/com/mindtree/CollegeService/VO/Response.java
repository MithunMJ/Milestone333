package com.mindtree.CollegeService.VO;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.CollegeService.entity.College;

public class Response
{
	private College college;
	private List<Student> students = new ArrayList<Student>();
	
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public Response(College college, ArrayList<Student> students) {
		super();
		this.college = college;
		this.students = students;
	}
	public Response() {
		super();
	}

	
}
