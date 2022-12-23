package com.masai.app.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private boolean wantsNewsletter;
	
	//a person can have only one type of gender and gender can be associated with multiple students
	@ManyToOne(cascade = CascadeType.ALL)
	private Gender gender;
	
	//a student can have only one address but an address can belong to multiple students
	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	///a student can have multiple courses and a course can be taken by multiple students
	@OneToMany(mappedBy = "student")
	List<Student_Course> student_courses;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public boolean isWantsNewsletter() {
		return wantsNewsletter;
	}


	public void setWantsNewsletter(boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<Student_Course> getStudent_courses() {
		return student_courses;
	}


	public void setStudent_courses(List<Student_Course> student_courses) {
		this.student_courses = student_courses;
	}


	public Student(int id, String firstName, String lastName, LocalDate birthDate, boolean wantsNewsletter,
			Gender gender, Address address, List<Student_Course> student_courses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.wantsNewsletter = wantsNewsletter;
		this.gender = gender;
		this.address = address;
		this.student_courses = student_courses;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", wantsNewsletter=" + wantsNewsletter + ", gender=" + gender + ", address=" + address
				+ ", student_courses=" + student_courses + "]";
	}
	
	
	

	
	
}
