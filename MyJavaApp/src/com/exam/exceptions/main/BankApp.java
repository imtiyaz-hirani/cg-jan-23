package com.exam.exceptions.main;

class WithdrawalException extends RuntimeException{ 
	private static final long serialVersionUID = 1L;
	private String message;
	
	public WithdrawalException(String message){
		this.message = message; 
	}
	
	public String getMessage(){
		return message;
	}
}

public class BankApp {
	public static void main(String[] args) {

	}
}

class WithdrawService{
	public static double withdrawal(double balance, double amount) {
		if(amount>balance)  
			throw new WithdrawalException("Insufficient Balance");
		 
		if(amount <= 0)
			throw new WithdrawalException("Amount cannot be Zero or negative");
		
		if(amount > 50000)
			throw new WithdrawalException("Amount has be <= 50000");
		
		balance = balance - amount; 
		return balance; 
	}

}








