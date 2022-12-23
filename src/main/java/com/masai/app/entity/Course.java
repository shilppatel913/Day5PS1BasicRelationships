package com.masai.app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	private int id;
	private String title;

	@ManyToOne(cascade = CascadeType.ALL)
	private Teacher teacher;
	
	@OneToOne
	private CourseMaterial courseMaterial;
	
	@OneToMany(mappedBy = "course")
	List<Student_Course> student_courses;

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public CourseMaterial getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(CourseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}

	public List<Student_Course> getStudent_courses() {
		return student_courses;
	}

	public void setStudent_courses(List<Student_Course> student_courses) {
		this.student_courses = student_courses;
	}

	public Course(int id, String title, Teacher teacher, CourseMaterial courseMaterial,
			List<Student_Course> student_courses) {
		super();
		this.id = id;
		this.title = title;
		this.teacher = teacher;
		this.courseMaterial = courseMaterial;
		this.student_courses = student_courses;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", teacher=" + teacher + ", courseMaterial=" + courseMaterial
				+ ", student_courses=" + student_courses + "]";
	}
	
	
	
}
