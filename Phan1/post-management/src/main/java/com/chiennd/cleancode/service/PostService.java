package com.chiennd.cleancode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiennd.cleancode.entity.Post;
import com.chiennd.cleancode.repo.PostRepository;


@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public void addPost(Post post) {
		postRepository.save(post);
	}

}
