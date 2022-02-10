package constructordemo;

public class Student {
//Q: What is best practice? Setting the values of the variables when we initialize them, or is it better to initialize the variables, and then assign values to them?
//A: Instructor Mohammad said it is best practice to initialize the variables, and then assign the default values in the default constructor.
	int studentId;
	String studentName;
	int marks;
	int grade;
	
	//(Default) Constructor will get called automatically when "new Product();" is used
	public Student() {
		System.out.println("-----------DEFAULT CONSTRUCTOR CALLED");
		studentId= -1;
		studentName= "NotAvailable";
		marks= -1;
		grade= -1;
	}
		
	//Parameterized/Argument constructor
	public Student(int studentId, String studentName, int marks, int grade) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}

	//Parameterized/Argument constructor
	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	//This method needs to be called to run.
	public void printStudentDetails() {
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);

	}

	public static void main(String[] args) {
		//When initialized, calls (special method) constructor
		Student student1 = new Student(24, "Zach", 86, 76);
		//Calls method
		student1.printStudentDetails();
		
		Student student2 = new Student(351, "Micheal", 100, 96);
		student2.printStudentDetails();

		Student student3 = new Student(12, "Gretchen");
		student3.printStudentDetails();
	}

}
