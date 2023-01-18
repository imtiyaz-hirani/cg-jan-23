package com.exam.exceptions.main;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionAppTest {

	@Test
	public void computePercentTest(){
		
		Assert.assertEquals("A", ResultCompute.computePercent(340, 400));
		Assert.assertEquals("B", ResultCompute.computePercent(245, 400));
		Assert.assertEquals("C", ResultCompute.computePercent(200, 400));
		
		try {
			Assert.assertEquals("", ResultCompute.computePercent(410, 400));
		}
		catch(MarksException e) {
			Assert.assertEquals("Illegal Marks Given", e.getMessage());
		}
		
		try {
			Assert.assertEquals("", ResultCompute.computePercent(-2, 400));
		}
		catch(MarksException e) {
			Assert.assertEquals("Marks cannot be negative", e.getMessage());
		}
	}
}
