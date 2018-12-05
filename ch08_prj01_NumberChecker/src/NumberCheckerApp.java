
public class NumberCheckerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Odd/Even Checker!");
		
//		MyConsole mc = new MyConsole();
//		String aString = mc.getString("Enter a string");
		
		// create instance of Console object
		Console c = new Console();
		
		boolean choice = true;
		while (choice == true) {
			System.out.println(); // print blank line
			int integer = c.getInt("Enter an integer: ");
			if (integer % 2 == 0) {
				System.out.println(); // print blank line
				System.out.println("The number " + integer + " is even.");
				System.out.println(); 
			} else {
				System.out.println(); 
				System.out.println("The number " + integer + " is odd.");
				System.out.println(); 
			}
		c.askToContinue();
		}
		// goodbye message
		System.out.println("Goodbye and excellent job!");

	}

}
