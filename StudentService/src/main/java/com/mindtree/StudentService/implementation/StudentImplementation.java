package com.mindtree.StudentService.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.StudentService.VO.College;
import com.mindtree.StudentService.VO.ResponseTemplate;
import com.mindtree.StudentService.entity.Student;
import com.mindtree.StudentService.repository.StudenetRepository;
import com.mindtree.StudentService.service.StudentService;


@Component
public class StudentImplementation  implements StudentService
{
	@Autowired
	private  StudenetRepository stdRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Student addStudent(Student std) {
		return stdRepo.save(std);
	}

	@Override
	public List<Student> list() {
		return stdRepo.findAll();
	}

	@Override
	public Student searchById(long id) {
		return stdRepo.findById(id);
	}

	@Override
	public ResponseTemplate stdWithCollege(long rollNo) {
		ResponseTemplate RT = new ResponseTemplate();
		Student std = stdRepo.findById(rollNo);
		
		long clg_id = std.getClg_id();
		College clg= restTemplate.getForObject("http://COLLEGE-SERVICE/department/"+clg_id, College.class);
		RT.setCollege(clg);
		RT.setStudent(std);
		return RT;
	}

	@Override
	public Student assignCollege(long rollNo, long clgId) 
	{
		Student std = stdRepo.findById(rollNo);
		College clg = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+rollNo, College.class);

		std.setClg_id(rollNo);
		stdRepo.save(std);
		return std;
	}

	@Override
	public List<Student> getByCollegeId(long clg_id) 
	{
		return stdRepo.getByClgId(clg_id);
	}

	@Override
	public List<Student> getStudentByCollegeWithDescAge(long clg_id) {
		return stdRepo.getEmployeeByDepartmentWithDescAge(clg_id);
	}


}
