package inheritance.emp.wage;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;

public class WageEmpData extends EmployeeData {
	public WageEmp getEmployee() {
		return new WageEmp();
	}
}
