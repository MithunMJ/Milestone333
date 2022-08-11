package com.mindtree.StudentService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mindtree.StudentService.entity.Student;


@Repository
public interface StudenetRepository  extends JpaRepository<Student, Long> 
{
	Student findById(long id);

	@Query(value="SELECT * FROM student WHERE clg_id=:clg_id ORDER BY name ASC", nativeQuery = true)
	List<Student> getByDeptId(@Param("dept_id") long clg_id);
	
	@Query(value="SELECT * FROM student WHERE clg_id=:clg_id ORDER BY age DESC", nativeQuery = true)
	List<Student> getEmployeeByDepartmentWithDescAge(@Param("clg_id") long clg_id);

	List<Student> getByClgId(long clg_id);

}
