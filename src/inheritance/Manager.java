package inheritance;

public class Manager extends Employee {
	String departmentName;
	int salary=58000;

	
	public Manager() {
		//compiler inserts super();
		System.out.println("Manager default constructor called");
	}

	public Manager(String departmentName) {
		super();
		System.out.println("Manager 1st parametrized constructor called");
		this.departmentName = departmentName;
	}
	
	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager 2nd parametrized constructor called");
	}



	public void displayManagerDetails() {
		int salary = 63000;
		
		System.out.println("Manager Id: "+employeeId);
		System.out.println("Manager Name: "+employeeName);
		System.out.println("Department Name: "+departmentName);
		System.out.println("Local Salary: "+salary);
		System.out.println("Manager Salary: "+this.salary);
		System.out.println("Employee Salary: "+super.salary);
	}

}
