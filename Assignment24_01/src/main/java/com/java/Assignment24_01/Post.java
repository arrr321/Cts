package com.java.Assignment24_01;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "Post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "createBy")
	private String createdBy;
	
	@Column(name ="url")
	private String url;
	
	@Column(name = "date")
	private LocalDate date;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Post_id")
	
	private List<Comment> comment;

	public Post(String createdBy, String url, LocalDate date) {
		super();
		this.createdBy = createdBy;
		this.url = url;
		this.date = date;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", createdBy=" + createdBy + ", url=" + url + ", date=" + date + ", comment="
				+ comment + "]";
	}
	
	
	
	
	
	
}
