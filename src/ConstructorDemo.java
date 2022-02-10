
public class ConstructorDemo {

	//Java automatically provides a default constructor, unless a Parameterized/Argument constructor is created.
	//If there is a Parameterized/Argument constructor, then the default constructor must be manually created if it is nessasary.
	
	String employeeName;

	public ConstructorDemo(String employeeName) {
		this.employeeName = employeeName;
	}

	public ConstructorDemo() {
		employeeName = "Arbuckle";
	}

	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo("Narlington");
		ConstructorDemo c3 = new ConstructorDemo();

		System.out.println(c1.employeeName);
		System.out.println(c2.employeeName);
		System.out.println(c3.employeeName);
	}

}
