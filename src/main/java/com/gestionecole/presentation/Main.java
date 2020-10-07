package com.gestionecole.presentation;

import com.gestionecole.domaine.Student;
import com.gestionecole.service.StudentService;

public class Main {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		
		Student student = new Student("Cédric", "Nozerand", "cedric.nozerand@gmail.com", "11 rue Gérard de Nerval", "0601293069", "20/10/1993");
		studentService.createStudent(student);
	}
}
