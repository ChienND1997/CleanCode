package com.chiennd.cleancode.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiennd.cleancode.entity.Post;
import com.chiennd.cleancode.entity.User;
import com.chiennd.cleancode.exceptions.PostException;
import com.chiennd.cleancode.repo.PostRepository;
import com.chiennd.cleancode.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private PostService postService;

	@Autowired
	private CommentService commentService;

	public Post writePost(Post post) {
		post = new Post(post.getTitle(), post.getContent(), post.getUser());
		postService.addPost(post);
		return post;
	}

	public boolean deletePost(long id) throws PostException {
		Optional<Post> idPost = postRepository.findById(id);
		if (idPost != null) {
			postRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
