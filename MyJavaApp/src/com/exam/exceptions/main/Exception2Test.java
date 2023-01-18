package com.exam.exceptions.main;

import org.junit.Assert;
import org.junit.Test;

public class Exception2Test {

	@Test
	public void searchForJobTest() {
		
		Exception2 obj = new Exception2();
		try {
			Assert.assertEquals("", obj.searchForJob(201,""));
		}
		catch(NotEligibleException e) {
			Assert.assertEquals("The age entered is not typical for a human being", e.getMessage());
		}
		
		try {
			Assert.assertEquals("", obj.searchForJob(0,""));
		}
		catch(NotEligibleException e) {
			Assert.assertEquals("The age entered is not typical for a human being", e.getMessage());
		}
		
		try {
			Assert.assertEquals("", obj.searchForJob(18,""));
		}
		catch(NotEligibleException e) {
			Assert.assertEquals("You are underage for any job", e.getMessage());
		}
		
		try {
			Assert.assertEquals("We have openings for junior developer", obj.searchForJob(22,"B.E"));
			
		}
		catch(NotEligibleException e) { }
		
		try {
			Assert.assertEquals("We have openings for senior developer", 
					obj.searchForJob(26,"M.S"));
			Assert.assertEquals("We have openings for senior developer", 
					obj.searchForJob(26,"PhD"));
		}
		catch(NotEligibleException e) { }
		
		try {
			Assert.assertEquals("We do not have any job that matches your qualifications", 
					obj.searchForJob(19,"BA"));
			
			Assert.assertEquals("Sorry we have no openings for now", 
					obj.searchForJob(28,"MBA"));
		}
		catch(NotEligibleException e) { }
		
		 
	}
}
