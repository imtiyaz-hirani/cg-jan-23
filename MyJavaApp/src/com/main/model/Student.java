package com.main.model;

public class Student {
	private String name;
	private String address;
	private String contact;

	public Student(String name, String address, String contact) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}

}
