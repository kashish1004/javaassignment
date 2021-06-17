package inheritance;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

import inheritance.emp.Employee;
import inheritance.emp.mgr.Manager;
import inheritance.emp.WageEmp;
public class InheritanceMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee(100,"Abc",4521783.25);
		System.out.println(a);
		Manager m = new Manager(101,"Xyz",8785469.23,145243.2);
		m.showIncentives();
		m.display();
		System.out.println(m);
		WageEmp w = new WageEmp();
		w.calculateWage();
		w.display();
		System.out.println(w);
		WageEmp w1 = new WageEmp(102, "Pqr", 6, 12.10f);
		w1.display();
		System.out.println(w1);;
	}

}
