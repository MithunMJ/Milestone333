package com.mindtree.CollegeService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.CollegeService.VO.Response;
import com.mindtree.CollegeService.entity.College;


@Service
public interface CollegeService 
{
    College add(College clg);
	List<College> list();
	College update(long id,String name);
	College searchById(long id);
	List<Response> listWithStudent();

}
