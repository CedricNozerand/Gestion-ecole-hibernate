package com.gestionecole.service;

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
}
