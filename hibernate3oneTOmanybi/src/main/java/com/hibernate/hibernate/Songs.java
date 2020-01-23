package com.hibernate.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
	@Table(name="songs")
	public class Songs {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="title")
		private String title;
		
		@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
							 CascadeType.DETACH, CascadeType.REFRESH})
		@JoinColumn(name="album_id")
		private Album album;
		
		public Songs() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Album getAlbum() {
			return album;
		}

		public void setAlbum(Album album) {
			this.album = album;
		}

		public Songs(String title) {
			super();
			this.title = title;
		}

		@Override
		public String toString() {
			return "Songs [id=" + id + ", title=" + title + "]";
		}
		
		
		

}

