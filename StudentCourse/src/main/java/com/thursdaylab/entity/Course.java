package com.thursdaylab.entity;

import java.util.ArrayList;
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

@Entity
@Table(name="course1")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="C_Id")
	private int Id;
	
	@Column(name="C_Name")
	private String Name;
	
	@ManyToOne
	@JoinColumn(name="Student_Id")
	private Student student;

	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)
	private List<Student> student1=new ArrayList<Student>();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudent1() {
		return student1;
	}

	public void setStudent1(List<Student> student1) {
		this.student1 = student1;
	}

	public Course(int id, String name, Student student, List<Student> student1) {
		super();
		Id = id;
		Name = name;
		this.student = student;
		this.student1 = student1;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


}
