package org.client;
import org.test.*;
public class ClientDetails {
	private void clientID() {
		System.out.println("Client id is 1234");
	}
	private void clientName() {
		System.out.println("client name is asdasd");
	}
	public static void main(String[] args) {
		ClientDetails c=new ClientDetails();
		c.clientID();
		c.clientName();
		CompDetails c1=new CompDetails();
		EmpDetails e=new EmpDetails();
		e.empId();
		e.empName();
		c1.compID();
		c1.compName();
		
		
	}
}
