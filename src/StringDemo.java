
public class StringDemo {

	public static void main(String[] args) {

		//Different things you can do with Strings
		String name = "Mario";
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.concat("Revature"));
		System.out.println(name.compareTo("TestMario"));
		System.out.println(name.compareToIgnoreCase("mario"));
		System.out.println(name.substring(3));		
		System.out.println(name.substring(1,3));		
		System.out.println(name.toUpperCase());		
		System.out.println(name.endsWith("io"));		
		System.out.println(name.startsWith("m"));		
		System.out.println(name);
		
		
		//Can't do it with Primitives
		int number = 5;
		
		System.out.println(number);
	}

}
