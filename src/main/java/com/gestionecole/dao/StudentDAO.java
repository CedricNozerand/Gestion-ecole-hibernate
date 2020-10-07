package com.gestionecole.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.gestionecole.domaine.Student;

public class StudentDAO {

	EntityManagerFactory emf;
	EntityManager em;
	
	public StudentDAO() {
		emf = Persistence.createEntityManagerFactory("gestionEcole-pu");
		em = emf.createEntityManager();
	}
	
	public void create(Student student) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(student);
		tx.commit();
	}
	
	public void update(Student student) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(student);
		tx.commit();
	}
	
	public void delete(int id) {
		
	}
	
	public void findByID(int id) {
		
	}
	
	public void findAll() {
		
	}
}
