package org.methodoverloading;

public class EmployeeDetails {
	
	public void empInfo() {
		System.out.println("Employee info");
	}
	
	public void empInfo(int id) {
		System.out.println("Employee id is"+id);
	}
	
	public void empInfo(String name) {
		System.out.println("Employee name is"+name);
	}
	
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empInfo();
		e.empInfo(100);
		e.empInfo("Basha");
	}
}
