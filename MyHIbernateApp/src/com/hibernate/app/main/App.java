package com.hibernate.app.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.app.model.Employee;

public class App {
	public static void main(String[] args) {
		/*
		 * Step 1: Reach out to persistence.xml [mydb]
		 * Step 2: Create EntityManager: this helps me create tables using classes
		 * Step 3: Initiate transaction for queries
		 */
		
		try {
			//STEP 1
			EntityManagerFactory entityManagerFactory 
					= Persistence.createEntityManagerFactory("mydb");
			
			//STEP 2
			EntityManager entityManager 
					= entityManagerFactory.createEntityManager();
			
			//STEP 3
			EntityTransaction entityTransaction 
					= entityManager.getTransaction();
			
			while(true) {
				System.out.println("------Hibernate Operations------");
				System.out.println("1. Insert Employee Record");
				System.out.println("2. Display all Employees");
				System.out.println("3. Delete an Employee");
				System.out.println("4. Update Employee Record");
				System.out.println("0. Exit");
				Scanner sc  = new Scanner(System.in); 
				int input = sc.nextInt();
				if(input == 0 ) {
					System.out.println("Exiting.. Bye..");
					break;
				}
				switch(input) {
					case 1: 
						/* Read Input from User */
						System.out.println("Insert Employee Record");
						System.out.println("Enter Name:");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("Enter Email ");
						String email = sc.next();
						System.out.println("Enter Contact");
						String contact = sc.next();
						
						/*Attach all inputs to Employee Object */
						Employee employee = new Employee(); //POJO: Plain Old Java Object
						employee.setName(name);
						employee.setContact(contact);
						employee.setEmail(email);
						entityTransaction.begin();
						entityManager.persist(employee);
						entityTransaction.commit();
						System.out.println("Employee added to DB...");
						break; 
					case 2: 
						System.out.println("Employee Records");
						break;
					case 3: 
						System.out.println("Employee Deletion");
						break;
					case 4: 
						System.out.println("Employee Updation");
						break;
					default: 
						System.out.println("Invalid Input");
						break; 
					}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
