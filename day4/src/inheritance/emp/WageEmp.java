package inheritance.emp;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

public class WageEmp extends Employee {
	private int noOfHours;
	float ratePerHour;
	public WageEmp() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor of WageEmp");
		noOfHours = 8;
		ratePerHour = 10.23f;
	}
	public WageEmp(int empId,String name,int hours,float rate) {
		super(empId,name);
		noOfHours = hours;
		ratePerHour = rate;
	}
	public void calculateWage() {
		System.out.println("Wage of Employee is: "+(ratePerHour*noOfHours));
	}
	public void display() {
		System.out.println("WageEmp Details: ");
		super.display();
	}
	public String toString() {
		super.toString();
		return "";
	}
}
