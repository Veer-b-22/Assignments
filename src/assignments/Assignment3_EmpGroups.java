package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		Assignment3_Employees emp = new Assignment3_Employees();
		/*
		 * String[] EmployeeNames = new String[2]; String[] EmployeeIDs = new String[2];
		 * EmployeeIDs[0] = "1234"; EmployeeNames[0] = "Bharath";
		 * System.out.print("Employee Name : " + EmployeeNames[0] + " " +
		 * EmployeeIDs[0]); // System.out.print(EmployeeIDs[0]);
		 */

		String[] employeenames = { emp.employeeName1, emp.employeeName2, emp.employeeName3 };
		int[] employeeId = { emp.employeeID1, emp.employeeID2, emp.employeeID3 };

		System.out.println(employeenames[0] + ":" + employeeId[0]);

	}

}
