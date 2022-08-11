package com.mindtree.CollegeService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.CollegeService.entity.College;

@Repository
public interface CollegeRepositories extends JpaRepository<College, Long>
{
	College findById(long id);

	College save(College clg);

}
