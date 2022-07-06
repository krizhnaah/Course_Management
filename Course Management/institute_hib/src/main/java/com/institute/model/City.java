package com.institute.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "city" , schema = "course_schema")
public class City {
	
	@Id
	@Column(name = "id")
	private int cityId;
	
	@Column(name = "name")
	private String cityName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "state")
	private State state;
	
	@OneToMany(mappedBy = "city")
	private Set<Student> students = new HashSet<Student>();
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "city")
	private Set<Employee> employees = new HashSet<Employee>();

	
	
	public int getCityId() {
		return cityId;
	}
	
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	

}
