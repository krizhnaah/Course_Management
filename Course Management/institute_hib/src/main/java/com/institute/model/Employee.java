package com.institute.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "employee" , schema = "course_schema")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "age")
	private byte age;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gender")
	private Gender gender;
	
	@Column(name = "qualification")
	private String qualification;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "designation")
	private Designation designation;
	
	@Column(name = "hobby")
	private String hobby;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city")
	private City city;
	
	@Column(name = "doj")
	private Date doj;
	
	@Column(name = "phone_num")
	private long phoneNum;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pincode")
	private int pincode;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "subject_employee_relation" , joinColumns = @JoinColumn(name = "employee") , inverseJoinColumns = @JoinColumn(name = "subject"))
	private Set<Subject> subjects;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable (name = "batch_employee_relation" , joinColumns = @JoinColumn(name = "employee") , inverseJoinColumns = @JoinColumn(name = "batch"))
	private Set<Batch> batch;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public Set<Batch> getBatch() {
		return batch;
	}
	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
	}
	
	
}
