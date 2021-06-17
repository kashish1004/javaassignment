/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package containment.emp;
import containment.date.MyDate;
public class Employee {
	private int empId;
	private String name;
	
	private MyDate birthDate;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int empId, String name,MyDate birthDate) {
		this.empId = empId;
		this.name = name;
		this.birthDate = new MyDate();
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void display() {
		System.out.println("Name: "+name+"\nEmployee ID: "+empId+"\nBirthDate: "+birthDate);
	}
	public String toString() {
		return "Name: "+name+"\nEmployee ID: "+empId+"\nBirthDate: "+birthDate;
	}
	
	
}
