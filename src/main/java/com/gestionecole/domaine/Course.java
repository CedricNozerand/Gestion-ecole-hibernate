package com.gestionecole.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String theme;
	private int hoursNumber;
	
	public Course() {
		super();
	}
	
	public Course(String theme, int hoursNumber) {
		super();
		this.theme = theme;
		this.hoursNumber = hoursNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getHoursNumber() {
		return hoursNumber;
	}

	public void setHoursNumber(int hoursNumber) {
		this.hoursNumber = hoursNumber;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + "theme=" + theme + ", numberHours=" + hoursNumber + "]";
	}
}
