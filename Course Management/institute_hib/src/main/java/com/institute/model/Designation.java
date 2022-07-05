package com.institute.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "designation" , schema = "course_schema")
public class Designation {

	@Id
	@Column(name = "designation_id")
	private int designationId;
	
	@Column(name = "designation_name")
	private String desigantionName;
	
	@OneToMany(mappedBy = "designation")
	private Set<Employee> employees;
	
	
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}		
	public String getDesigantionName() {
		return desigantionName;
	}
	public void setDesigantionName(String desigantionName) {
		this.desigantionName = desigantionName;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
}
