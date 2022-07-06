package com.institute.main;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.institute.hibernateUtility.HibernateUtility;
import com.institute.model.*;

public class InstituteMain {
	
	public static void main(String[] args) {
		
		
		//Subject
		
		//1
		Subject coreJava = new Subject();
		coreJava.setSubjectId(1);
		coreJava.setSubjectName("Core Java");
		coreJava.setDuration(Duration.ofHours(30));
		//2
		Subject advancedJava = new Subject();
		advancedJava.setSubjectId(2);
		advancedJava.setSubjectName("Advanced Java");
		advancedJava.setDuration(Duration.ofHours(60));

		
		
		//Set of Subjects
		
		Set<Subject> javaSubjects = new HashSet<Subject>();
		
		javaSubjects.add(coreJava);
		javaSubjects.add(advancedJava);
		
		//Course
		
		Course javaDeveloper = new Course();
		
		javaDeveloper.setCourseId(1);
		javaDeveloper.setCourseName("Java Developer");
		javaDeveloper.setCourseFee(22000);
		
		//Set of Course
		
		Set<Course> courses = new HashSet<Course>();
		
		courses.add(javaDeveloper);
		
		//State
		
		State tamilNadu = new State();
		
		tamilNadu.setStateId(1);
		tamilNadu.setStateName("Tamilnadu");
		
		
		//Cities
		City chennai = new City();
		
		chennai.setCityId(1);
		chennai.setCityName("Chennai");
		chennai.setState(tamilNadu);
		
		City coimbatore = new City();
		
		coimbatore.setCityId(3);
		coimbatore.setCityName("Coimbatore");
		coimbatore.setState(tamilNadu);
		
		
		//Designation
		
		Designation seniorStaff = new Designation();
		
		seniorStaff.setDesignationId(1);
		seniorStaff.setDesigantionName("Senior Staff");
		
		//Batch
		
		Batch morning = new Batch();
		
		morning.setBatchId((byte) 1);
		morning.setBatchTime(LocalTime.of(10, 00));
		
		Set<Batch> morningBatch = new HashSet<Batch>();
		morningBatch.add(morning);
		
		//Gender
		
		Gender male = new Gender();
		
		male.setGenderId((byte) 1);
		male.setGenderName("Male");
		
		//Student
		
		Student dinesh = new Student();
		
		dinesh.setStudentId(100101);
		dinesh.setStudentName("Dinesh");
		dinesh.setAge((byte) 23);
		dinesh.setCity(coimbatore);
		dinesh.setBatch(morningBatch);
		dinesh.setCourses(courses);
		dinesh.setDoj(new Date(2022,05,23));
		dinesh.setEmail("dineshtotal420@gmail.com");
		dinesh.setGender(male);
		dinesh.setPaidFee(22000);
		dinesh.setPhoneNum(9898878746L);
		dinesh.setPincode(641625);
		dinesh.setQualification("B.E Computer Science");
		
		Student lokesh = new Student();
		
		lokesh.setStudentId(100102);
		lokesh.setStudentName("Lokesh");
		lokesh.setAge((byte) 23);
		lokesh.setCity(coimbatore);
		lokesh.setBatch(morningBatch);
		lokesh.setCourses(courses);
		lokesh.setDoj(new Date(2022,01,17));
		lokesh.setEmail("lokeshvishnu1212@gmail.com");
		lokesh.setGender(male);
		lokesh.setPaidFee(22000);
		lokesh.setPhoneNum(9898878746L);
		lokesh.setPincode(641625);
		lokesh.setQualification("B.E Computer Science");
		
		
		List<Student> morningStudents = new ArrayList<Student>();
		
		morningStudents.add(lokesh);
		morningStudents.add(dinesh);

		
		
		//Employee
		
		Employee karthikeyan = new Employee();
		
		karthikeyan.setEmployeeId(10101);
		karthikeyan.setEmployeeName("Karthikeyan");
		karthikeyan.setAge((byte) 35);
		karthikeyan.setBatch(morningBatch);
		karthikeyan.setCity(coimbatore);
		karthikeyan.setDesignation(seniorStaff);
		karthikeyan.setDoj(new Date(2018,03,19));
		karthikeyan.setEmail("karthikeyan1903@gmail.com");
		karthikeyan.setGender(male);
		karthikeyan.setHobby("Reading Books");
		karthikeyan.setPhoneNum(9890987392L);
		karthikeyan.setPincode(641665);
		karthikeyan.setQualification("M.E Computer Science");
		karthikeyan.setSubjects(javaSubjects);
		
		
		
		//getSession factory
		
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		
		//get session
		
		Session session = sessionFactory.getCurrentSession();
		
		//begin transaction
		
		session.beginTransaction();
		
		//persist data

//		session.persist(javaDeveloper);
//		session.persist(chennai);
//		session.persist(karthikeyan);
		session.persist(dinesh);


		
		//commit transaction
		
		session.getTransaction().commit();
		
		
		//close session
		
		HibernateUtility.getSessionFactory().getCurrentSession().close();
		
		
	}

}
