import javax.management.monitor.Monitor;

//Folders contain classes
//Classes contain methods
//methods contain statements

public class CodeStructorDemo {

	// Declaration and Initialization. Will get called before the instance block
	// (2.5)
	int num = 100;

	{
		// Brackets will provide a space to allow statements to be made. also will run
		// before every constructor.
		System.out.println("3. Initializer");
	}
	// Static will get called first.
	static {
		System.out.println("1. Static");
	}

	public CodeStructorDemo() {
		System.out.println("4. CodeStructorDemo constructor called");
	}

	public void display() {
		System.out.println("5. Display called, num = " + num);
	}

	public static void main(String[] args) {
		System.out.println("2. Main");

		// When calling a constructor, it initalizes all the variables. So "int
		// num=100;" is called before initializer
		CodeStructorDemo c1 = new CodeStructorDemo();
		System.out.println("Mainb");
		c1.display();
		CodeStructorDemo c2 = new CodeStructorDemo();
	}

}

//Order:
//Static is run first
//Then the main method
//If the main method initialized a constructor, the instance block will run next.
//Then the called constructor will run
//Finally, a method may be called and run.

/*
 * Zoom meeting 2/4/2022 Exercise answer:
 * 1. Static 1
 * 2. Static 2
 * 3. Main
 * 4. W Constructor
 * 5. X Instance Block
 * 6. X Constructor
 * 7. Z Instance Block
 * 8. Z Constructor
 */
