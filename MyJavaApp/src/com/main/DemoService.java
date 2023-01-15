package com.main;

public class DemoService { //Controller --> Service

	public int sum(int n1,int n2) {
		return n1 + n2; 
	}
	
	/* Compute Grade as per the marks given */
	public String computeGrade(double marks, double totalMarks) {
		double percent  = (marks * 100) / totalMarks;
		return percent>75?"A": percent>60?"B": "C";
	}
}
