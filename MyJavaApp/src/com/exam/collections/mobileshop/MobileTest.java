package com.exam.collections.mobileshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MobileTest {

	@Test
	public void addMobileTest() {
		Mobile mobile = new Mobile(); 
		Assert.assertEquals("model successfully added", mobile.addMobile("oppo", "K10"));
		Assert.assertEquals("model successfully added", mobile.addMobile("oppo", "K11"));
		
	}
	@Test
	public void addMobileProperTest() {
		Mobile mobile = new Mobile(); 
		
		HashMap<String,List<String>> map = new HashMap<>(); 
		List<String> list = new ArrayList<>();
		list.add("K10");
		map.put("oppo",list);
		
		Assert.assertEquals(map, mobile.addMobileProper("oppo", "K10"));


		//Use case 2
		HashMap<String,List<String>> map1 = new HashMap<>(); 
		List<String> list1 = new ArrayList<>();
		list1.add("K10");
		list1.add("K11");
		map1.put("oppo",list1);
		
		Assert.assertEquals(map1, mobile.addMobileProper("oppo", "K11"));
	}
}
