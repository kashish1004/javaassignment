/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package containment;
import containment.date.MyDate;
import containment.emp.Employee;
public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setName("ABC");
		emp.setEmpId(100);
		emp.setBirthDate(new MyDate(10,3,1995));
		System.out.println("Employee Details using getter methods:");
		System.out.println("Name is: "+emp.getName()+"\nEmployeeId is: "+emp.getEmpId()+"\nBirthDate is: "+emp.getBirthDate());
		System.out.println("Employee Details using toString() method: \n"+emp);
		Employee emp1 = new Employee(104,"XYZ",new MyDate());
		System.out.println("Employee Details using display():");
		emp1.display();
	}

}
