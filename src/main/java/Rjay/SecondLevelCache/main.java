package Rjay.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class main {

	
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory session = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session s1 = session.openSession();
		Session s2 = session.openSession();
		
		
		Student Std=s1.get(Student.class, 1);
		Student Std1=s1.get(Student.class, 1);
		
		Student S = s2.get(Student.class, 1);
		
		
		session.close();
		s1.close();
		s2.close();

	
	
	
	}}
