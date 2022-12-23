package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//student and courses have many to many relationship
@Entity
@Table(name = "student_courses")
public class Student_Course {
		@Id
		private int id;
		
		@ManyToOne
		private Student student;
		
		@ManyToOne
		private Course course;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course course) {
			this.course = course;
		}

		public Student_Course(int id, Student student, Course course) {
			super();
			this.id = id;
			this.student = student;
			this.course = course;
		}

		public Student_Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Student_Course [id=" + id + ", student=" + student + ", course=" + course + "]";
		}
		
		

}

