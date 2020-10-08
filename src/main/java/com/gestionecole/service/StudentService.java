package com.gestionecole.service;

import java.util.List;

import com.gestionecole.dao.StudentDAO;
import com.gestionecole.domaine.Student;

public class StudentService {

	private StudentDAO studentDao;
	
	public StudentService() {
		studentDao = new StudentDAO();
	}
	
	public void createStudent(Student student) {
		studentDao.create(student);
	}
	
	public void updateStudent(Student student) {
		studentDao.update(student);
	}
	
	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}
	
	public Student findStudentByID(int id) {
		return studentDao.findByID(id);
	}
	
	public List<Student> findAllStudent() {
		return studentDao.findAll();
	}
}
