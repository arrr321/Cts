package com.java.Assignment24_01;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Comment")
public class Comment {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "text")
	private String text;
	
	@Column(name = "date")
	private LocalDate date;
	
	
	private Post post;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Post getPost() {
		return post;
	}


	public void setPost(Post post) {
		this.post = post;
	}


	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", date=" + date + ", post=" + post + "]";
	}


	public Comment( String text, LocalDate date) {
		super();
		
		this.text = text;
		this.date = date;
		
	}


	public Comment() {
	}
	

	
}
