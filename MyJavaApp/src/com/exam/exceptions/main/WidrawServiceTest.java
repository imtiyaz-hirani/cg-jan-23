package com.exam.exceptions.main;

import org.junit.Assert;
import org.junit.Test;

public class WidrawServiceTest {
	
	@Test
	public void withdrawalTest() {
		Assert.assertEquals(25000, Math.round(WithdrawService.withdrawal(75000, 50000)));
		
		try {
			Assert.assertEquals(25000, Math.round(WithdrawService.withdrawal(75000, 80000)));
		}
		catch(WithdrawalException e) {
			Assert.assertEquals("Insufficient Balance", e.getMessage());
		}
		
		try {
			Assert.assertEquals(25000, Math.round(WithdrawService.withdrawal(75000, 0)));
		}
		catch(WithdrawalException e) {
			Assert.assertEquals("Amount cannot be Zero or negative", e.getMessage());
		}
		
		try {
			Assert.assertEquals(25000, Math.round(WithdrawService.withdrawal(75000, 60000)));
		}
		catch(WithdrawalException e) {
			Assert.assertEquals("Amount has be <= 50000", e.getMessage());
		}
		
	}
}
//25000 25000.0