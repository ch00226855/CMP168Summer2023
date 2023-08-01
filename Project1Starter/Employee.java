
public class Employee extends Person {

	private String deptName;
	private static int numEmployees;
	private int employeeID;
	
	public Employee() {
		super();
		this.deptName = "";
		this.employeeID = numEmployees;
		numEmployees++;
	}

	public Employee(String deptName) {
		this();
		this.deptName = deptName;
	}
	
	public Employee(String name, int birthYear, String deptName) {
		super(name, birthYear);
		this.deptName = deptName;
		this.employeeID = numEmployees;
		numEmployees++;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static int getNumEmployees() {
		return numEmployees;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (!(obj instanceof Employee)) {
			return false;
		} else {
			Employee employee = (Employee) obj;
			if ((super.equals(employee)) &&
				(this.deptName.equals(employee.deptName)) &&
				(this.employeeID == employee.employeeID)) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return super.toString() + 
				String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
	}

	public int compareTo(Employee employee) {
		if (this.employeeID < employee.employeeID) {
			return -1;
		} else if (this.employeeID > employee.employeeID) {
			return 1;
		} else {
			return 0;
		}
	}
}
