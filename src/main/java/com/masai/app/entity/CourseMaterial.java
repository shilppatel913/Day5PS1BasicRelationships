package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coursematerial")
public class CourseMaterial {
	
	@Id
	private int id;
	private String url;
	
	@OneToOne(mappedBy = "courseMaterial")
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseMaterial(int id, String url, Course course) {
		super();
		this.id = id;
		this.url = url;
		this.course = course;
	}

	public CourseMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", url=" + url + ", course=" + course + "]";
	}
	
	
}
