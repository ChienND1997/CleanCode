package com.chiennd.cleancode.controllers;

import com.chiennd.cleancode.model.Course;
import com.chiennd.cleancode.model.CourseType;
import com.chiennd.cleancode.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}

	@GetMapping(value = "/api/v1/courses")
	public ResponseEntity<Course> getCourse(@RequestParam(value = "keyword") String keyword,
			@RequestParam(value = "sortBy") CourseType type) {
		try {
			Course course = null;
			if (keyword.isEmpty()) {
				course = (Course) courseService.list();
			} else {
				course = courseService.get(keyword);
			}
			if (type.equals(type.NAME)) {
				course = courseService.get("ASC");
			} else if (type.equals(type.OPENED)) {
				course = courseService.get("DESC");
			} else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return new ResponseEntity(course, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
