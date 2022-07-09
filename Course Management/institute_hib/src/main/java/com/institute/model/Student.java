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
@Table(name = "student" , schema = "course_schema")
public class Student {

	@Id
	@Column(name = "id")
	private int studentId;
	
	@Column(name = "name")
	private String studentName;
	
	@Column(name = "age")
	private byte age;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gender")
	private Gender gender;
	
	@Column(name = "qualification")
	private String qualification;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city")
	private City city;
	
	@Column(name = "doj")
	private Date doj;
	
	@Column(name = "paid_fee")
	private double paidFee;
	
	@Column(name = "phone_num")
	private long phoneNum;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pincode")
	private int pincode;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_batch_relation", schema = "course_schema", joinColumns = @JoinColumn(name = "student_id") , inverseJoinColumns = @JoinColumn(name = "batch_id"))
	private Set<Batch> batch;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course_relation", schema = "course_schema", joinColumns = @JoinColumn(name = "student_id") , inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> courses;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public double getPaidFee() {
		return paidFee;
	}
	public void setPaidFee(double paidFee) {
		this.paidFee = paidFee;
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
	public Set<Batch> getBatch() {
		return batch;
	}
	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	
	
}
