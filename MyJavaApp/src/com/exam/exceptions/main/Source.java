package com.exam.exceptions.main;

public class Source {
	  //Implement the two function given in description in here...
	  
	public String doOperation(Activity a){
		String result="";
		if(a.getOperator().equalsIgnoreCase("+")) {
			result = a.getString1().concat(a.getString2());
			return result;
		}
		if(a.getOperator().equalsIgnoreCase("-")) {
			result = a.getString1().replace(a.getString2(), ""); //s1 = harrypotter  s2=potter
			return result;
		}
		return result;
	}
	
	public String handleException(Activity a) throws Exception{
		if(a.getString1() == null || a.getString2() == null)
			throw new NullPointerException("Null values found");
		
		if(!(a.getOperator().equals("+")) && (!(a.getOperator().equals("-")))) //*
			throw new Exception(a.getOperator());
		
		return "No Exception Found";
	}
		public static void main(String args[] ) throws Exception {
	    //Write your own main to check the program...
			Source source = new Source();
			Activity a2 = new Activity("harrypotter","potter","-");
			//System.out.println("harrypotter".replace("potter", ""));
		 	System.out.println(source.doOperation(a2));
		}
	}


class Activity{
	  //Implement Activity class here..
	String string1;
  String string2;
  String operator;
  
  public Activity(String string1, String string2, String operator){
  	this.string1 = string1;
  	this.string2 = string2;
  	this.operator = operator;
  }
  
  public String getString1(){
  	return string1;
  }
  
  public String getString2(){
  	return string2;
  }
  
  public String getOperator(){
  	return operator;
  }
	}