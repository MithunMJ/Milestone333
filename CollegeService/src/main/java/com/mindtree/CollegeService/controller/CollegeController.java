package com.mindtree.CollegeService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.CollegeService.VO.Response;
import com.mindtree.CollegeService.entity.College;
import com.mindtree.CollegeService.service.CollegeService;

@RestController
@RequestMapping("/clg")
public class CollegeController 
{
	@Autowired
	CollegeService clgService;
	
	@PostMapping
	public College add(@RequestBody College clg)
	{
		return clgService.add(clg);
	}
	
	@GetMapping
	public List<College> list()
	{
		return clgService.list();
	}
	
	@GetMapping("/{id}")
	public College searchById(@PathVariable long id)
	{
		return clgService.searchById(id);
	}
	
	@GetMapping("/all")
	public List<Response> listWithStudent()
	{
		return clgService.listWithStudent();
	}
	

	

}
