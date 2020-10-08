package com.gestionecole.presentation;

import java.util.Scanner;

import com.gestionecole.domaine.Student;
import com.gestionecole.service.StudentService;

public class Main {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		
		//studentService.deleteStudent(student);
		
		Scanner sc = new Scanner(System.in);
		String res;
		
		System.out.println("********** BIENVENUE DANS LE PROGRAMME DE GESTION DES ECOLES  **********");
		System.out.println("Quelle action souhaitez vous faire?");
		
		do {
			System.out.println("1 - Cr�er un nouvel �tudiant");
			System.out.println("2 - Modifier un �tudiant");
			System.out.println("3 - Supprimer un �tudiant");
			System.out.println("4 - Chercher un �tudiant");
			System.out.println("5 - Lister tous les �tudiants");
			res = sc.nextLine();
		}while(!res.equals("1") && !res.equals("2") && !res.equals("3") && !res.equals("4") && !res.equals("5"));
		
		if(res.equals("1")) {
			System.out.println("Indiquez le pr�nom de l'�tudiant");
			String firstname = sc.nextLine();
			
			System.out.println("Indiquez le nom de l'�tudiant");
			String lastname = sc.nextLine();
			
			System.out.println("Indiquez l'adresse mail de l'�tudiant");
			String mailAdresse = sc.nextLine();
			
			System.out.println("Indiquez l'adresse de l'�tudiant");
			String adresse = sc.nextLine();
			
			System.out.println("Indiquez le num�ro de t�l�phone de l'�tudiant");
			String phoneNumber = sc.nextLine();
			
			System.out.println("Indiquez la date d'anniversaire de l'�tudiant");
			String dateOfBirthday = sc.nextLine();
			
			Student student = new Student(firstname, lastname, mailAdresse, adresse, phoneNumber, dateOfBirthday);
			studentService.createStudent(student);
		}else if(res.equals("2")) {
			System.out.println("Indiquez l'id de l'�tudiant � modifier");
			String id = sc.nextLine();
			
			Student student = studentService.findStudentByID(Integer.parseInt(id));
			
			System.out.println("Indiquez le pr�nom de l'�tudiant");
			student.setFirstName(sc.nextLine());
			
			System.out.println("Indiquez le nom de l'�tudiant");
			student.setLastName(sc.nextLine());
			
			System.out.println("Indiquez l'adresse mail de l'�tudiant");
			student.setMailAdresse(sc.nextLine());
			
			System.out.println("Indiquez l'adresse de l'�tudiant");
			student.setAdress(sc.nextLine());
			
			System.out.println("Indiquez le num�ro de t�l�phone de l'�tudiant");
			student.setNumberPhone(sc.nextLine());
			
			System.out.println("Indiquez la date d'anniversaire de l'�tudiant");
			student.setDateOfBirth(sc.nextLine());
			
			studentService.updateStudent(student);
		}else if(res.equals("3")) {
			System.out.println("Indiquez l'id de l'�tudiant � supprimer");
			String id = sc.nextLine();
			
			Student student = studentService.findStudentByID(Integer.parseInt(id));
			
			studentService.deleteStudent(student);
		}else if(res.equals("4")) {
			System.out.println("Indiquez l'id de l'�tudiant que vous recherchez");
			String id = sc.nextLine();
			
			Student student = studentService.findStudentByID(Integer.parseInt(id));
			
			System.out.println(student.toString());
		}else if(res.equals("5")) {
			for(Student student : studentService.findAllStudent()) {
				System.out.println(student.toString());
			}
		}
	}
}
