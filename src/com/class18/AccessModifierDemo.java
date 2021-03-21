package com.class18;

public class AccessModifierDemo {

		
		String name;
		private String BankAccountPassword;
		String SSNumber;
		
		public void park() {
			System.out.println("Everyone can go to a public park");
		}
		
		void car() {
			System.out.println("My little brother can borrow my car");
		}
		
		private void toothBrush() {
			System.out.println("No one should use it");
		}
		
		void printInfo() {
			System.out.println(name);
			System.out.println(BankAccountPassword);
			System.out.println(SSNumber);	
		}

	}


