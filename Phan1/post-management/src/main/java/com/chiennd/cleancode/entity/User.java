package com.chiennd.cleancode.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "full_name")
	private String fullName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Post> posts; // Một người có thể viết nhiều Post

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Comment> comments;

	public User(String fullName) {
		this.fullName = fullName;
	}

	void writePost(Post post) {

	}

	public long getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public List<Comment> getComments() {
		return comments;
	}

//	void deletePost(Post post) throws PostException { // Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception
//
//	}

}
