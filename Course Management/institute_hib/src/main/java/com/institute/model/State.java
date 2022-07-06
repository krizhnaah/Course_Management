package com.institute.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "state" , schema = "course_schema")
public class State {
	
	@Id
	@Column(name = "id")
	private int stateId;
	
	@Column(name = "name")
	private String stateName;
	
	@OneToMany(mappedBy = "state")
	private Set<City> cities;
	
	
	
	
	public int getStateId() {
		return stateId;
	}
	
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

}
