package com.institute.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gender" , schema = "course_schema")
public class Gender {
	
	@Id
	@Column(name = "gender_id")
	private byte genderId;
	
	@Column(name = "gender_name")
	private String genderName;
	
	@OneToMany(mappedBy = "gender")
	private Set<Employee> employees;
	
	@OneToMany(mappedBy = "gender")
	private Set<Student> students;
	
	
	public byte getGenderId() {
		return genderId;
	}
	public void setGenderId(byte i) {
		this.genderId = i;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
