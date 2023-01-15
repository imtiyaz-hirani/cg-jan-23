package com.exam.collections.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ImplementationTest {
	
	@Test
	public void getCountTest() {
		/* Use Case 1 */
		/* Input Prep : Sample Input */
		List<Candidate> list = new ArrayList<>();
		  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		
		  /* Expectation Prep : Sample Output*/
		  Map<String,Long> map = new HashMap<>();
		  map.put("Male", 1L);
		  map.put("Female", 1L);
		  
		Assert.assertEquals(map, Implementation.getCount(list));
		
		/* Use Case 2 */
		list.add(new Candidate(188, "Anna Scott", 26, "Female", "Product Development", 2014, 32500.0));
		 /* Expectation Prep : Sample Output*/
		  Map<String,Long> map2 = new HashMap<>();
		  map2.put("Male", 1L);
		  map2.put("Female", 2L);
		  
		  Assert.assertEquals(map2, Implementation.getCount(list));
		  
	    /* Use Case 3 */
		list.add(new Candidate(199, "Harry Potter", 22, "Male", "Product Development", 2014, 32500.0));
		 /* Expectation Prep : Sample Output*/
		  Map<String,Long> map3 = new HashMap<>();
		  map3.put("Male", 2L);
		  map3.put("Female", 2L);
		   
		 Assert.assertEquals(map3, Implementation.getCount(list));
		
	}
	
	@Test
	public void getAverageAgeTest() {
		List<Candidate> list = new ArrayList<>();
		  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		
		  //Use Case 1
		  /* Expectation Prep : Sample Output*/
		  Map<String,Double> map = new HashMap<>();
		  map.put("Male", 28.0);
		  map.put("Female", 32.0);
		Assert.assertEquals(map, Implementation.getAverageAge(list));
		
		//Use Case 2
		list.add(new Candidate(188, "Anna Scott", 26, "Female", "Product Development", 2014, 32500.0));
		Map<String,Double> map2 = new HashMap<>();
		  map2.put("Male", 28.0);
		  map2.put("Female", 29.0);
		Assert.assertEquals(map2, Implementation.getAverageAge(list));
		
		//Use Case 3
		list.add(new Candidate(199, "Harry Potter", 22, "Male", "Product Development", 2014, 32500.0));
		 /* Expectation Prep : Sample Output*/
		Map<String,Double> map3 = new HashMap<>();
		  map3.put("Male", 25.0);
		  map3.put("Female", 29.0);
		 Assert.assertEquals(map3, Implementation.getAverageAge(list));
	}
}
