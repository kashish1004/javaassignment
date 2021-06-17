package inheritance;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {
	public static  void showEmpInfo(Employee emp) {
		emp.display();
		if(emp instanceof Manager) {
			((Manager)emp).showIncentives();
		}
		if(emp instanceof WageEmp) {
			((WageEmp)emp).calculateWage();
		}
	}
	public static void main(String[] args) {
		Manager m = new Manager(3,"Xyz",2874596.23,15478.23);
		showEmpInfo(m);
		WageEmp w = new WageEmp(4, "Pqrs", 7, 3.2f);
		showEmpInfo(w);
	}
	
}
