

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int marks[] = {23,42,64,23,54,34,12,53,65};
		
		//enhanced for loop
		for(int i:marks) {
			System.out.println(i);
		}
		//Use case : take 5 numbers and print the sum
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("Please enter 5 numbers: ");
		for(int i:num) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("Sum: " + sum);
			
	}

}
