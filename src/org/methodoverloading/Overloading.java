package org.methodoverloading;

public class Overloading {
	
	//Method overloading or Compiletime Polymorphism 
	
	//same method name with different arguments in a single class

	//1.same class name 2.same method name 3.Different argument
	
//	QUESTION 2:
//		------------
//		     Project   :EmployeeDetails
//		     Package   :org.emp
//		     Class     :Employee 
//		     Methods   :empId()
//
//		Description
//		You have to overload the method empId() based on different datatype in arguments.

	
	private void empId(String name ) {
		System.out.println(name);
	}
	
	private void empId(byte age) {
		System.out.println(age);
	}
	
	private void empId(short Id) {
		System.out.println(Id);
	}
	
	private void empId(int phoneno) {
		System.out.println(phoneno);
	}
	private void empId(float percentage) {
		System.out.println(percentage);
	}
	
	
	public static void main(String[] args) {
		
		Overloading o =new Overloading();
		o.empId("Dinesh");
		o.empId("27");
		o.empId("1000");
		o.empId(85.5f);
	}
	
}
