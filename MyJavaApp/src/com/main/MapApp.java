package com.main;
import java.util.*;

import com.main.model.Student; 

public class MapApp {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "harry");
		map.put(2, "ronald");
		map.put(3, "hermione");
		
		System.out.println(map.keySet());
		
		for(Integer i :map.keySet() ) {
			System.out.println(i);
		}
		
		System.out.println(map.values());
		for( String s:map.values() ) {
			System.out.println(s);
		}
		
		System.out.println(map);
		
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		//get 
		String val = map.get(2);
		System.out.println(val);
		
		
		Map<Integer,Student> mapStudent = new HashMap();
		Student s1 = new Student("harry","hogwards","455445");
		Student s2 = new Student("ronald","london","4334545");
		
		mapStudent.put(1, s1);
		mapStudent.put(2, s2);
		
		System.out.println(mapStudent.get(2));
	}
}
