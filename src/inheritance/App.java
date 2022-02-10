package inheritance;

public class App {

	public static void main(String[] args) {
		Manager m = new Manager(56, "John");
		m.departmentName="HR";
		
		m.displayManagerDetails();
		m.submitDocuments();
	}

}
