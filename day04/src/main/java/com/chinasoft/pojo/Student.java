package com.chinasoft.pojo;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String phone;
	private String address;
	private String password;
	private int c_id;
	private List<Gender> gender;
 	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String phone, String address, String password, int c_id, List<Gender> gender) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.c_id = c_id;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public List<Gender> getGender() {
		return gender;
	}

	public void setGender(List<Gender> gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", password="
				+ password + ", c_id=" + c_id + ", gender=" + gender + "]";
	}
	
}
