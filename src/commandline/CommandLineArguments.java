package commandline;

public class CommandLineArguments {

	public static void main(String[] args) {

		switch (args[0]) {
		case "help":
			System.out.println("Commands: help, say, hello");
			break;
		case "say":
			for(int i = 1; i < args.length; ++i) {
				System.out.print(args[i]+" ");
			}
			break;
		case "hello":
			System.out.println("I also greet you.");
			break;
		default:
			System.out.println("Invalid command.");
			break;
		}

	}

}
