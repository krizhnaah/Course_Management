package com.institute.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course" , schema = "course_schema")
public class Course {
	
	@Id
	@Column(name = "course_id")
	private int courseId;
	@Column(name = "course_name")
	private String courseName;
	@Column(name = "course_fee")
	private double courseFee;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "course_subject_relation" , joinColumns = @JoinColumn(name = "course_id") , inverseJoinColumns = @JoinColumn(name = "subject_id"))
	private Set<Subject> courseSubjects;
	
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> courseStudents;
	
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public Set<Subject> getCourseSubjects() {
		return courseSubjects;
	}
	public void setCourseSubjects(Set<Subject> courseSubjects) {
		this.courseSubjects = courseSubjects;
	}
	public Set<Student> getCourseStudents() {
		return courseStudents;
	}
	public void setCourseStudents(Set<Student> courseStudents) {
		this.courseStudents = courseStudents;
	}


}
