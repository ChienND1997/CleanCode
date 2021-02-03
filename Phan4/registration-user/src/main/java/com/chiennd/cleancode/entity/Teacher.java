package com.chiennd.cleancode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Teacher extends User {

	private String phone;

	private int experiences;

	@OneToMany(mappedBy = "teacher")
	private Set<Course> courses;

}
