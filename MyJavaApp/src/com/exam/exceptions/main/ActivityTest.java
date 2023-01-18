package com.exam.exceptions.main;

import org.junit.Assert;
import org.junit.Test;

public class ActivityTest {

	@Test
	public void doOperationTest(){
		Source source = new Source();
		Activity a1 = new Activity("harry"," potter","+");
		Assert.assertEquals("harry potter", source.doOperation(a1));
		
		Activity a2 = new Activity("harrypotter","potter","-");
		Assert.assertEquals("harry", source.doOperation(a2));
		
		Activity a3 = new Activity("harrypotter","potter","*");
		Assert.assertEquals("", source.doOperation(a3));
		
		Activity a4 = new Activity(null,"potter","*");
		try {
			Assert.assertEquals("", source.handleException(a4));
		}
		catch(Exception e) {
			Assert.assertEquals("Null values found",e.getMessage());
		}
		
		Activity a5 = new Activity("harry",null,"*");
		try {
			Assert.assertEquals("", source.handleException(a5));
		}
		catch(Exception e) {
			Assert.assertEquals("Null values found",e.getMessage());
		}
		
		Activity a6 = new Activity("harry","potter","*");
		try {
			Assert.assertEquals("", source.handleException(a6));
		}
		catch(Exception e) {
			Assert.assertEquals("*",e.getMessage());
		}
		
		Activity a7 = new Activity("harry","potter","/");
		try {
			Assert.assertEquals("", source.handleException(a7));
		}
		catch(Exception e) {
			Assert.assertEquals("/",e.getMessage());
		}
		
		Activity a8 = new Activity("harry","potter","+");
		try {
			Assert.assertEquals("No Exception Found", source.handleException(a8));
		}
		catch(Exception e) { }
		
		Activity a9 = new Activity("harry","potter","-");
		try {
			Assert.assertEquals("No Exception Found", source.handleException(a9));
		}
		catch(Exception e) { }
	}
}
