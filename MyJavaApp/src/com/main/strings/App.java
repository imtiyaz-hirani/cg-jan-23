package com.main.strings;

public class App {
	public static void main(String[] args) {
		String str ="harry potter"; //literal 
		String s1 = new String("   rohan kadam   ");
		
		String invoice = "3 kgs=230";
		/* Reverse the string : use StringBuilder */
		System.out.println(Implementation.doReverse(str)); 
		
		System.out.println(s1.length()); //17
		System.out.println(Implementation.deleteWhiteSpaces(s1).length()); //11
		System.out.println(Implementation.deleteAllSpaces(s1));
		System.out.println(Implementation.computePerKgRate("6 units=330"));
	}
}

class Implementation{
	static String doReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	static String deleteWhiteSpaces(String s) {
		s = s.trim();
		return s; 
	}
	
	static String deleteAllSpaces(String s) {
		s = s.trim();
		s = s.replace(" ", "");
		return s;
	}
	
	static double computePerKgRate(String s) { //3 kgs=230 -- AI
		String[] sarry = s.split(" ");//sarry[0]=3  sarry[1]="kgs=230" 
		String noKgs = sarry[0]; //noKgs="3"
		
		String[] sarr = s.split("="); //sarr[0]="3 kgs" sarr[1]="230"
		String totalAmount = sarr[1]; //"230"
		
		double nk = Double.parseDouble(noKgs); //3.0
		double total = Double.parseDouble(totalAmount); //230.0
		
		return total/nk;
		
		
	}
} //int(Integer), float(Float), long, double(Double),short , byte: Wrapper classes 

/* Pro Tip: Every wrapper class has a parse method which converts String into its primitive   */
/*
  String equals method 
  == operator 
 */


/*
  StringBuilder class 
  [extra methods] 
 */

/*
 identifying or finding patterns in String: regex 
 */
