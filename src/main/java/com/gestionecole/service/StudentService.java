package com.gestionecole.service;

import java.util.List;

import com.gestionecole.dao.StudentDAO;
import com.gestionecole.domaine.Student;

public class StudentService {

	private StudentDAO studentDao;
	
	public StudentService() {
		studentDao = new StudentDAO();
	}
	
	/**
	 * Créer un nouvel étudiant en utilisant le dao
	 * @param student
	 */
	public void createStudent(Student student) {
		studentDao.create(student);
	}
	
	/**
	 * Modifie un étudiant en utilisant le dao
	 * @param student
	 */
	public void updateStudent(Student student) {
		studentDao.update(student);
	}
	
	/**
	 * supprime un étudiant en utilisant le dao
	 * @param student
	 */
	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}
	
	/**
	 * Un étudiant un étudiant en fonction de son id en utilisant le dao
	 * @param id
	 * @return Student
	 */
	public Student findStudentByID(int id) {
		return studentDao.findByID(id);
	}
	
	/**
	 * Créer un nouvel étudiant en utilisant le dao
	 * @return Liste d'étudiant
	 */
	public List<Student> findAllStudent() {
		return studentDao.findAll();
	}
}
