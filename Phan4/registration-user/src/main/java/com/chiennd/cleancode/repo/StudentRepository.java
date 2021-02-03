package com.chiennd.cleancode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiennd.cleancode.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
