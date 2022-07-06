package org.overriding;

public class AxisBank extends BankInfo {
	
	public void deposite() {
		
		super.savings();
		super.deposit();
		System.out.println("deposite:100");
	}
	
	
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		
		a.deposit();
		a.savings();
		a.fixed();
		a.deposite();
		
	}

	
}
