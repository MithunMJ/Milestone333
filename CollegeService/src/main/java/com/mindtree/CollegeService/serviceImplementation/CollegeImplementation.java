package com.mindtree.CollegeService.serviceImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.mindtree.CollegeService.VO.Response;
import com.mindtree.CollegeService.VO.Student;
import com.mindtree.CollegeService.entity.College;
import com.mindtree.CollegeService.repositories.CollegeRepositories;
import com.mindtree.CollegeService.service.CollegeService;




@Component
public class CollegeImplementation implements CollegeService
{
	@Autowired
	CollegeRepositories collegeRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public College add(College clg) 
	{
		return collegeRepository.save(clg);
	}

	@Override
	public List<College> list() 
	{
		return collegeRepository.findAll();
	}

	@Override
	public College update(long id, String name) {
		College dept = collegeRepository.findById(id);
		dept.setName(name);
		return collegeRepository.save(dept);
	}

	@Override
	public College searchById(long id) {
		if(collegeRepository.findById(id)==null)
		{
			return null;
		}
		return collegeRepository.findById(id);
	}

	@Override
	public List<Response> listWithStudent() {
		List<Response> List = new ArrayList<Response>();
		List<College> allCollege = this.list();
		Iterator<College> i = allCollege.iterator();
		while(i.hasNext())
		{
			College clg = i.next();
			ResponseEntity<Student[]> response =
					  restTemplate.getForEntity("http://EMPLOYEE-SERVICE/employee/employee-with-ascname/"+clg.getClgId(),
							  Student[].class);
			Student[] students = response.getBody();
			List<Student> emps = Arrays.asList(students);
			Response RS = new Response();
			RS.setCollege(clg);
			List.add(RS);
		}
		return List;
	}

	

}
