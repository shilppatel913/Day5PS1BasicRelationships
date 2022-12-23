package com.masai.app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender {

	@Id
	private int id;
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "gender")
	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Gender(int id, String type, List<Student> students) {
		super();
		this.id = id;
		this.type = type;
		this.students = students;
	}

	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gender [id=" + id + ", type=" + type + ", students=" + students + "]";
	}

	
	
}
