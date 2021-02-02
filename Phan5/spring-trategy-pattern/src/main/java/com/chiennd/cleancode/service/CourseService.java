package com.chiennd.cleancode.service;

import com.chiennd.cleancode.model.Course;
import com.chiennd.cleancode.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

	private final CourseRepository repository;

	@Autowired
	public CourseService(CourseRepository repository) {
		this.repository = repository;
	}

	public Course get(String keyword) {
		return repository.findName(keyword);
	}

	public Course sortName(String name) {
		return repository.sortName(name);
	}

	public List<Course> list() {
		Iterable<Course> course = repository.findAll();
		List<Course> list = new ArrayList<>();
		course.forEach(list::add);
		return list;
	}

}
