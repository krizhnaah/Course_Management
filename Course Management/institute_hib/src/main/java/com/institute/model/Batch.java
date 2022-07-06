package com.institute.model;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "batch" , schema = "course_schema")
public class Batch {
	
	@Id
	@Column(name = "id")
	private byte batchId;
	
	@Column(name = "time")
	private LocalTime batchTime;
	
	@ManyToMany(mappedBy = "batch")
	private List<Employee> employees;
	
	@ManyToMany(mappedBy = "batch")
	private List<Student> students;
	
	
	public byte getBatchId() {
		return batchId;
	}
	public void setBatchId(byte batchId) {
		this.batchId = batchId;
	}
	public LocalTime getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(LocalTime batchTime) {
		this.batchTime = batchTime;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
