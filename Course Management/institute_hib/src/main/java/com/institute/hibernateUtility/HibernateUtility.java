package com.institute.hibernateUtility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.institute.model.*;

public class HibernateUtility {
	
	private static SessionFactory sessionAnnotatedFactory;
	
	
	private static SessionFactory buildAnnotatedSessionFactory() {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate-annotation.cfg.xml");
		configuration.addAnnotatedClass(Course.class);
		configuration.addAnnotatedClass(Batch.class);
		configuration.addAnnotatedClass(City.class);
		configuration.addAnnotatedClass(Designation.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Gender.class);
		configuration.addAnnotatedClass(State.class);
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Subject.class);
		
		System.out.println("Hibernate Loaded successfully....");
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
												.applySettings(configuration.getProperties()).build();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionAnnotatedFactory == null)
			sessionAnnotatedFactory = buildAnnotatedSessionFactory();
		
		return sessionAnnotatedFactory;		
	}

}
