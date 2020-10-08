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
			System.out.println("1 - Créer un nouvel étudiant");
			System.out.println("2 - Modifier un étudiant");
			System.out.println("3 - Supprimer un étudiant");
			System.out.println("4 - Chercher un étudiant");
			System.out.println("5 - Lister tous les étudiants");
			res = sc.nextLine();
		}while(!res.equals("1") && !res.equals("2") && !res.equals("3") && !res.equals("4") && !res.equals("5"));
		
		if(res.equals("1")) {
			System.out.println("Indiquez le prénom de l'étudiant");
			String firstname = sc.nextLine();
			
			System.out.println("Indiquez le nom de l'étudiant");
			String lastname = sc.nextLine();
			
			System.out.println("Indiquez l'adresse mail de l'étudiant");
			String mailAdresse = sc.nextLine();
			
			System.out.println("Indiquez l'adresse de l'étudiant");
			String adresse = sc.nextLine();
			
			System.out.println("Indiquez le numéro de téléphone de l'étudiant");
			String phoneNumber = sc.nextLine();
			
			System.out.println("Indiquez la date d'anniversaire de l'étudiant");
			String dateOfBirthday = sc.nextLine();
			
			Student student = new Student(firstname, lastname, mailAdresse, adresse, phoneNumber, dateOfBirthday);
			studentService.createStudent(student);
		}else if(res.equals("2")) {
			System.out.println("Indiquez l'id de l'étudiant à modifier");
			String id = sc.nextLine();
			
			Student student = studentService.findStudentByID(Integer.parseInt(id));
			
			System.out.println("Indiquez le prénom de l'étudiant");
			student.setFirstName(sc.nextLine());
			
			System.out.println("Indiquez le nom de l'étudiant");
			student.setLastName(sc.nextLine());
			
			System.out.println("Indiquez l'adresse mail de l'étudiant");
			student.setMailAdresse(sc.nextLine());
			
			System.out.println("Indiquez l'adresse de l'étudiant");
			student.setAdress(sc.nextLine());
			
			System.out.println("Indiquez le numéro de téléphone de l'étudiant");
			student.setNumberPhone(sc.nextLine());
			
			System.out.println("Indiquez la date d'anniversaire de l'étudiant");
			student.setDateOfBirth(sc.nextLine());
			
			studentService.updateStudent(student);
		}else if(res.equals("3")) {
			System.out.println("Indiquez l'id de l'étudiant à supprimer");
			String id = sc.nextLine();
			
			Student student = studentService.findStudentByID(Integer.parseInt(id));
			
			studentService.deleteStudent(student);
		}else if(res.equals("4")) {
			System.out.println("Indiquez l'id de l'étudiant que vous recherchez");
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
