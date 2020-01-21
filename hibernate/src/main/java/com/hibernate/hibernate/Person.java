package com.hibernate.hibernate;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uId;
	@Column(name = "name")
	private String cName;
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	public Person(String uId, String cName, LocalDate dateOfBirth) {
		super();
		this.uId = uId;
		this.cName = cName;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", uId=" + uId + ", cName=" + cName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	public Person() {
		super();
	}

	

}