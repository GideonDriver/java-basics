public class ShortCircutExample {
	public static void main(String args[]) {
		int i = 0;
		int j = 2;
		boolean b = (i > j) && (j++ > i); //With the double &&, the second true/false statement will not run since the first was false.
		System.out.println(j);
		b = (i < j) & (j++ > i); //Since the single & is used, both statements will be run.
		System.out.println(j);
		
		
	}
}
