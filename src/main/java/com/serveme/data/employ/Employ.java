package com.serveme.data.employ;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employ {
	
	@Id
	private Integer id;
	private String ename;
	private Character gender;
	private Date birthdate;
	private Date hiredate;
	private String conver;
	private Double rating;
	
	public Employ(Integer id, String ename, Character gender, Date birthdate, Date hiredate, String conver,
			Double rating) {
		super();
		this.id = id;
		this.ename = ename;
		this.gender = gender;
		this.birthdate = birthdate;
		this.hiredate = hiredate;
		this.conver = conver;
		this.rating = rating;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getConver() {
		return conver;
	}
	public void setConver(String conver) {
		this.conver = conver;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	
}
