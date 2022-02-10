package inheritance;

public class Employee {
	int employeeId;
	String employeeName;
	int salary=43000;
	
	public void submitDocuments() {
		System.out.println("Submitting documents...");
	}
	
	public Employee() {
		System.out.println("Employee default constructor called");
	}
	
	public Employee(int employeeId, String employeeName) {
		System.out.println("Employee parametrized constructor called");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	

}
