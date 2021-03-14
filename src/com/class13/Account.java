package com.class13;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String PassedUserNameWhenLoggingIn, String PassedPasswordWhenLoggingIn) {
		if (userName.equals(PassedUserNameWhenLoggingIn) && password.equals(PassedPasswordWhenLoggingIn)) {
			System.out.println("welcome to Bank of America your balance is " + balance);
		}else {
			System.out.println("Username or password is not correct");
		}
	}
	
	public void printInfo() {
		if (isLoggedIn) {
			System.out.println("Your account number is " + accountNumber + " Your balance is " + balance);
		}
	}

}
