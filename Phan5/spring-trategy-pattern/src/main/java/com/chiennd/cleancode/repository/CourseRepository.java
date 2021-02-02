package com.chiennd.cleancode.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.chiennd.cleancode.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
	 @Query("SELECT c.name FROM Course c where c.name like :name") 
	    Course findName(@Param("id") String name);
	 @Query("SELECT c.name FROM Course c order by name :name") 
	    Course sortName(@Param("id") String name);
}
