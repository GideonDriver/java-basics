import java.util.Scanner;

public class DetermineLeapYear {

	public static void main(String[] args) {
		// permanent loop
		while (true) {
			// Initalize Scanner
			Scanner sc = new Scanner(System.in);

			// Ask for input and record response in "input"
			System.out.print("Enter Year: ");
			int input = sc.nextInt();

			//Checks if year is an end-of-year century, which must be divisible by 400 instead of 4.
			//If it can be divisible by 400, it passes on to the "else" statement.
			if ((input % 100) == 0 && !((input % 400) == 0)) {
				System.out.println("No, " + input + " is not a leap year");
			} else {
				// Credit to Anthony for helping simplify my "if" statement to within the syso line.
				// Checks if the year can cleanly be divided by 4, and outputs accordingly
				System.out.println(
						((input % 4) == 0 ? "Yes, " + input + " is a" : "No, " + input + " is not a") + " leap year");
			}

			// Print blank line to space out the results
			System.out.println();
		}
	}
}
