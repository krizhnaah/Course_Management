package com.institute.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject" , schema = "course_schema")
public class Subject {
	
	@Id
	@Column(name = "subject_id")
	private int subjectId;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@ManyToMany(mappedBy = "courseSubjects")
	private Set<Course> courses;
	
	@ManyToMany(mappedBy = "subjects")
	private Set<Employee> employees;
	
	
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	

}
