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
	 * Cr�er un nouvel �tudiant en utilisant le dao
	 * @param student
	 */
	public void createStudent(Student student) {
		studentDao.create(student);
	}
	
	/**
	 * Modifie un �tudiant en utilisant le dao
	 * @param student
	 */
	public void updateStudent(Student student) {
		studentDao.update(student);
	}
	
	/**
	 * supprime un �tudiant en utilisant le dao
	 * @param student
	 */
	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}
	
	/**
	 * Un �tudiant un �tudiant en fonction de son id en utilisant le dao
	 * @param id
	 * @return Student
	 */
	public Student findStudentByID(int id) {
		return studentDao.findByID(id);
	}
	
	/**
	 * Cr�er un nouvel �tudiant en utilisant le dao
	 * @return Liste d'�tudiant
	 */
	public List<Student> findAllStudent() {
		return studentDao.findAll();
	}
}
