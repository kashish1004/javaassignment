package inheritance.covariant;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData emp = new EmployeeData();
		Employee a = emp.getEmployee();
		a.display();
		ManagerData mng = new ManagerData();
		Manager m = mng.getEmployee();
		m.display();
		WageEmpData w = new WageEmpData();
		WageEmp w1 = w.getEmployee();
		w1.display();

	}

}
