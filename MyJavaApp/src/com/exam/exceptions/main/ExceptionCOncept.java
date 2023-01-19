package com.exam.exceptions.main;

public class ExceptionCOncept {
	public static void main(String[] args) {

	}
}

class MyService{
	public String m1(int age) throws MyException{
		if(age <19)
			throw new MyException("some msg");
		
		return "";
	}
	
	public String m2(int age) { //no need of warning in Unchecked Exception
		if(age <19)
			throw new MySecondException("some msg");
		
		return "";
	}
}

class MyException extends Exception{
	
	MyException(String msg){}
}


class MySecondException extends RuntimeException{ //unchecked exception
	
	MySecondException(String msg){}
}
