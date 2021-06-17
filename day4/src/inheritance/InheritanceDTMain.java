package inheritance;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		emp = new Manager(105, "ABCDE", 1458723.15, 254783.2);
		emp.display();
		((Manager)emp).showIncentives();
		emp = new WageEmp(1080, "WXYZ", 12, 124.20f);
		emp.display();
		((WageEmp)emp).calculateWage();
	}

}
