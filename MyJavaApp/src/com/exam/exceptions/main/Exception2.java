package com.exam.exceptions.main;

import java.util.Arrays;
import java.util.List;

public class Exception2 {
	String searchForJob(int age, String highestQualification) throws NotEligibleException {
		if(age >= 200 || age <= 0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		
		return CompanyJobRepository.getJobPrediction(age, highestQualification);
		 
	}
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}

class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
			if(age < 19) {
				throw new NotEligibleException("You are underage for any job");
			}
			
			if(age >= 21 && highestQualification.equalsIgnoreCase("B.E")) {
				return "We have openings for junior developer";
			}
			
			if(age >= 26 && 
					(highestQualification.equalsIgnoreCase("M.S") || highestQualification.equalsIgnoreCase("PhD"))) {
				return "We have openings for senior developer";
			}
			
			List<String> list = Arrays.asList("B.E", "M.S" ,"PhD");
			
			if(age >= 19 && (!list.contains(highestQualification))) {
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			}
			
		return "Sorry we have no openings for now";
	}
}
 
class NotEligibleException extends Exception {
	String message;
	
	public NotEligibleException(String message){
		this.message = message; 
	}
	
	public String getMessage(){
		return message;
	}
	
	 
}
