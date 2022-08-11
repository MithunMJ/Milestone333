package com.mindtree.StudentService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.StudentService.VO.ResponseTemplate;
import com.mindtree.StudentService.entity.Student;


@Service
public interface StudentService 
{
    Student addStudent(Student std);
	List<Student> list();
	Student searchById(long id);
	ResponseTemplate stdWithCollege(long rollNo);
	Student assignCollege(long rollNo, long clgId);
	List<Student> getByCollegeId(long clg_id);
	List<Student> getStudentByCollegeWithDescAge(long clg_id);

}
