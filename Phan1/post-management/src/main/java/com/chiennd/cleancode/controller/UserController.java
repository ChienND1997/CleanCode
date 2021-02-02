package com.chiennd.cleancode.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chiennd.cleancode.entity.Comment;
import com.chiennd.cleancode.entity.Post;
import com.chiennd.cleancode.service.UserService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/post")
	public ResponseEntity<ObjectNode> createPost(@RequestBody Post post) {
		try {
			post = userService.writePost(post);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity(post, HttpStatus.CREATED);
	}

	@PutMapping("/post/{id}")
	public ResponseEntity<ObjectNode> deletePost(@PathVariable("id") Long id) {
		try {
			userService.deletePost(id);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/comment")
	public ResponseEntity<ObjectNode> createComment(@RequestBody Comment comment) {
		return null;
		
	}
}
