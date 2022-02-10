import java.util.Scanner;
import java.util.Date;

public class Demo1 {
	//Prints a welcome message
	public void printWelcomeMessage() {
		System.out.println("Hi, welcome to Revature training.");
	}
	//Method that adds two ints (var args?)
	public int addNumbers(int...num) {
		int sum = 0;
		//enhanced for loop
		for(int i:num) {
			//System.out.println(i);
			sum += i;
		}
		return sum;
	}
	
	public void printProductNames(String...productName) {
		
		for(String p:productName) {
			System.out.println(p);
		}
	}
	
	//main method which calls other methods.
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//d.printWelcomeMessage();
		int a = 1;
		int b = 2;
		int result = d.addNumbers(a,b);
		result += d.addNumbers(4,6,6);
		result += d.addNumbers(12,8,5,9,4,3);
		
		d.printProductNames("a","b","c");
		System.out.println(result);
		System.out.println("===============");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Age:");
		int age = sc.nextInt();
		System.out.println("You are "+age+" years old.");
		
		Date date = new Date();
		System.out.println("Date: "+date);
	}

}
