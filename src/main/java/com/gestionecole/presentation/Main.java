package com.gestionecole.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.gestionecole.domaine.Course;
import com.gestionecole.domaine.Student;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionEcole-pu");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		Course course = em.find(Course.class, 1);
		Student student = new Student("Cédric", "Nozerand", "cedric.test@gmail.com", "11 rue test", "0102030405", "20/10/1993", course);
		
		em.persist(student);
		
		tx.commit();
		 
		em.close();
		emf.close();
	}
}
