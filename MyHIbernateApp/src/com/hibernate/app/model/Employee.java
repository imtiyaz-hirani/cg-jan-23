package com.hibernate.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /* This annotation will tell hibernate to create a table "employee" */
public class Employee {

	@Id  /* This annotation will make this ID a Primary key  */
	@GeneratedValue(strategy = GenerationType.AUTO) /* This will auto-increment ID */
	private int id; 
	
	private String name; 
	
	private String email; 
	
	private String contact;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	} 
	
	
}
