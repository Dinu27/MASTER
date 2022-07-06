package org.overriding;

public class BankInfo {
	
//	QUESTION 6:
//		------------
//		     Project   :BankDetails
//		     Package   :org.bank
//		     Class     :BankInfo
//		     Methods   :saving(),fixed(),deposit()
//
//		     Class     :AxisBank
//		     Methods   :deposit()
//
//		Description:
//		You have to override the method deposit in AxisBank.

	
	public void savings() {
		this.deposit();
		System.out.println("savings");
	}
	
	public void fixed() {
		System.out.println("fixed");
	}
	
	public void deposit() {
		System.out.println("deposit:200");
	}
	
}
