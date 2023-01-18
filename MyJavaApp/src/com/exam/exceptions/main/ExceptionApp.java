package com.exam.exceptions.main;

class MarksException extends RuntimeException{
	private String message; 
	
	public MarksException(String message){
		this.message = message; 
	}
	
	public String getMessage(){
		return message; 
	}
}

public class ExceptionApp {
	public static void main(String[] args) {
		try {
				System.out.println(ResultCompute.computePercent(-435, 400));
		}
		catch(MarksException e) {
			System.out.println(e.getMessage());
		}
	}
}

class ResultCompute{
	public static String computePercent(double marks, double totalMarks){
		if(marks > totalMarks) {
			 throw new MarksException("Illegal Marks Given");
		}
		if(marks < 0) {
			throw new MarksException("Marks cannot be negative");
		}
		double percent = (marks * 100) / totalMarks; 
		return percent>75?"A":percent>60?"B":"C";
	}
}
 

/*
 marks > totalMarks : Illegal Marks Given
 marks < 0 : Marks cannot be negative
 */

/*
 	sysout is not a return statement and should never be used in Service class where logic is
 	written
 	
 	Every scenario/condition in service class must return something so that it can be tested.
 */
 