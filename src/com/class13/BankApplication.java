package com.class13;

public class BankApplication {

	public static void main(String[] args) {
		
		Account munzAccount = new Account();
		munzAccount.accountNumber = "123";
		munzAccount.userName = "munz";
		munzAccount.password = "pass123";
		munzAccount.balance = 1400;
		munzAccount.login("munz", "pass123");

	}

}
