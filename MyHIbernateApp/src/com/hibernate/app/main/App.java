package com.hibernate.app.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
			
			System.out.println("DB Connection working!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
