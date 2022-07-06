package org.methodoverloading;

public class CompanyInfo {
	
//	QUESTION 3:
//		------------
//		   Project     :CompanyDetails
//		   Package     :org.company
//		   Class       :CompanyInfo
//		   Methods     :companyName()
//
//		Description
//		You have to overload the method companyName() based on different Number of arguments.
	

	private void companyName(String name) {
		
		System.out.println(name);
		
	}
	
	private void companyName(long age) {
		System.out.println(age);
	}
	
	private void companyName(char a) {
		System.out.println(a);
	}

public static void main(String[] args) {
	
	CompanyInfo c = new CompanyInfo();
	c.companyName("Dinesh");
	c.companyName('M');
	c.companyName(28);
	c.companyName(28, 9042864185l, "dinu");
	
}

private void companyName(int i, long phone, String name) {
	
	System.out.println(i);
	System.out.println(phone);
	System.out.println(name);
}

}

