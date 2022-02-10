package inheritance;

public class Overloading {

	public void add(int num1,int num2) {
		System.out.println("Add two numbers: "+(num1+num2));
	}
	
	//Method overloading has the same method name, but different input types. (There is also constructor overloading)
	public void add(String name,int id) {
		System.out.println("Add string and number: "+(name+"-"+id));
	}

	public void add(int id,String name) {
		System.out.println("Add number and string: "+(id+"-"+name));
	}

	public void add(String firstname,String lastname) {
		System.out.println("Add two strings: "+(firstname+" "+lastname));
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add(10,10);
		o.add("Steve",15);
		o.add(16,"Bob");
		o.add("Mark","Books");
		
		//Println is an example of method overloading. Same method name, but different intake types.
		System.out.println();
		System.out.println(90);
		System.out.println(true);
		System.out.println("Hello");
		System.out.println(13.95);

	}

}
