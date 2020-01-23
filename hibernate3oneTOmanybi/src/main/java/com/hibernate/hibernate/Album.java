package com.hibernate.hibernate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "album")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String albumName;
	
	
//	@Column(name = "date")
//	private LocalDate date;
	
	
	@OneToOne(cascade = {CascadeType.MERGE , CascadeType.DETACH ,CascadeType.PERSIST , CascadeType.REFRESH })
	@JoinColumn(name = "myimage_id")
	
	private Myimage image;
	
	
	
	
	@OneToMany(cascade = {CascadeType.MERGE , CascadeType.DETACH ,CascadeType.PERSIST , CascadeType.REFRESH })
	private List<Songs> songs;
	
	

	public Album(String albumName) {
		super();
		this.albumName = albumName;
		//this.date = date;
	}

	public void add(Songs s)
	{
		
		if(songs==null)
		{
			songs= new ArrayList<Songs>();
			
			
			}
		songs.add(s);
		s.setAlbum(this);
	}
	

}