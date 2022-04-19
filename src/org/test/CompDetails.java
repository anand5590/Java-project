package org.test;

public class CompDetails {

	public void compID() {
	System.out.println(" Comp id is 1235");
	}
	public void compName() {
	System.out.println("Comp name is TS");
	}
	public static void main(String[] args) {
		CompDetails c=new CompDetails();
		c.compID();
		c.compName();
		EmpDetails e=new EmpDetails();
		e.empId();
		e.empName();

	}
}
