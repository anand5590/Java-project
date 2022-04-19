package org.test;

public class EmpDetails {
	public void empId() {
		System.out.println("Emp id is 100650");
	}
	
	public void empName() {
		System.out.println("Emp Name is Anandan");
	}
	public static void main(String[] args) {
		EmpDetails e=new EmpDetails();
		e.empId();
		e.empName();
	}
}
