package accessdemo;

class Employee {
	int salary = 98000;

	public void display() {
		System.out.println(salary);
	}

}

class Manager extends Employee {
	public void display() {
		Employee e = new Employee();
		System.out.println(e.salary);
		//Is able to access object salary since Manager is a child class or Employee
		System.out.println(salary);
	}
}
class Clerk {
	public void display() {
		Employee e = new Employee();
		System.out.println(e.salary);
		//cannot access object if not a child of parent when has the object
		//System.out.println(salary);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
