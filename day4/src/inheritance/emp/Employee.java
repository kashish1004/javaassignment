package inheritance.emp;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */


public class Employee {
	private int empId;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor of Employee");
		empId = 103;
		name = "ABCDEF";
		salary = 1478523.23;
	}
	public Employee(int empId,String name) {
		this.empId = empId;
		this.name = name;
		System.out.println("Parameterized(2) Constructor of Employee");
	}
	public Employee(int empId,String name,double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("Parameterized(3) Constructor of Employee");
	}
	public void display() {
		System.out.println("Employee Details: "+"\nname is: "+ name + "\nID is: "+ empId + "\nSalary: "+ salary);
	}
	public String toString() {
		return "Employee Details: "+"\nname is: "+ name + "\nID is: "+ empId + "\nSalary: "+ salary;
	}
}
