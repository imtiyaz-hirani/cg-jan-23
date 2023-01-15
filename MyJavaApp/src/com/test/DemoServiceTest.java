package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.main.DemoService;

public class DemoServiceTest {

	@Test   //<-- Test Case
	public void sumTest() {
		DemoService demoService = new DemoService();
		//Use Case 1
		int actual = demoService.sum(4, 6); //Swati has done this operation
		int expected = 10; 
		Assert.assertEquals(expected, actual);
		//Use Case 2
		actual = demoService.sum(-4, 6);
		expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void computeGradeTest() {
		DemoService demoService = new DemoService();
		//Use Case 1 : A
		Assert.assertEquals("A", demoService.computeGrade(250, 300));
		//Use Case 2 : B
		Assert.assertEquals("B", demoService.computeGrade(200, 300));
		//Use Case 3 : C
		Assert.assertEquals("C", demoService.computeGrade(150, 300));
		//Use Case 4 : C
		Assert.assertEquals("C", demoService.computeGrade(-150, 300));		
	}
}
