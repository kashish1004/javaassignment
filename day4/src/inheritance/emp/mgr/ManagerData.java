package inheritance.emp.mgr;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {
	public Manager getEmployee() {
		return new Manager();
	}
}
