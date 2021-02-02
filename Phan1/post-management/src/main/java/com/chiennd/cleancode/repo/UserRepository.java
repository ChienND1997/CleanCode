package com.chiennd.cleancode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiennd.cleancode.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
