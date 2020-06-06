package com.chinasoft.pojo;

import java.util.List;

public class Gender {
	
	private int id;
	private String teacher;
	private List<Student> student;
	
	public Gender(int id, String teacher, List<Student> student) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.student = student;
	}

	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Gender [id=" + id + ", teacher=" + teacher + ", student=" + student + "]";
	}
	
}
