package inheritance;

public class Wrapper {

	public static void main(String[] args) {
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);

		long salary1 = 91716;
		Long salary2 = 91717l;
		System.out.println(salary2);

		// Boxing is the process of converting a primitive to its wrapper class.
		int marks1 = 100;
		Integer marks2 = new Integer(marks1); 		// boxing
		Integer marks3 = marks1; 					// auto boxing
		System.out.println(marks3);

		Double budget1 = 1972.87;
		double budget2 = Double.valueOf(budget1); 	// Unboxing < JDK1.5
		double budget3 = budget1; 					// auto Unboxing > JDK1.5
		System.out.println(budget3);

	}

}
