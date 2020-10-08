package com.gestionecole.dao;

import java.util.List;

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
	
	/**
	 * Cr�er un nouvel �tudiant
	 * @param student
	 */
	public void create(Student student) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(student);
		tx.commit();
	}
	
	/**
	 * modifie un �tudiant
	 * @param student
	 */
	public void update(Student student) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(student);
		tx.commit();
	}
	
	/**
	 * Supprime un �tudiant
	 * @param student
	 */
	public void delete(Student student) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(student);
		tx.commit();
	}
	
	/**
	 * Recherche un �tudiant en fonction de son id
	 * @param id
	 * @return student
	 */
	public Student findByID(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student student = em.find(Student.class, id);
		tx.commit();
		return student;
	}
	
	/**
	 * recherche tous les �tudiants
	 * @return list d'�tudiant
	 */
	public List<Student> findAll() {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Student> students = em.createQuery("select s from Student s").getResultList();
		tx.commit();
		return students;
	}
}
