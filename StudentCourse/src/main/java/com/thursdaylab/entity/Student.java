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
@Table(name="student1")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int SId;
	
	@Column
	private String SName;
	
	@ManyToOne
	@JoinColumn(name="Course_Id")
	private Course course;
	
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL)
	private List<Course> course1=new ArrayList<Course>();

	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Course> getCourse1() {
		return course1;
	}

	public void setCourse1(List<Course> course1) {
		this.course1 = course1;
	}

	public Student(int sId, String sName, Course course, List<Course> course1) {
		super();
		SId = sId;
		SName = sName;
		this.course = course;
		this.course1 = course1;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
