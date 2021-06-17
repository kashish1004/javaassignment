package inheritance.emp.mgr;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */


import inheritance.emp.Employee;

public class Manager extends Employee {
	private double incentives;
	public Manager() {
		System.out.println("Default Constructor of Manager");
		incentives = 15427869.21;
	}
	public Manager(int empId,String name,double salary,double incentives) {
		super(empId,name,salary);
		this.incentives = incentives;
		System.out.println("Parameterized Constructor of Manager");
	}
	public void showIncentives() {
		System.out.println("Incentives: " + incentives);
	}
	public void display() {
		System.out.println("Manager Details: ");
		super.display();
	}
	public String toString() {
		super.toString();
		return "";
	}
}
