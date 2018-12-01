public class CalculatorApp {

	public static void main(String[] args) {
	// welcome message
	System.out.println("Welcome to the Calculator App!");
	System.out.println(); // print blank line

	boolean choice = true;
	
	while(choice == true) {
		int option = Console.getIntWithinRange("Select from the 5 Options Below:\n\n"+ "1) Add 2 Integers\n" 
																		+ "2) Add 3 Integers\n"
																		+ "3) Add 2 Doubles \n"
																		+ "4) Add 3 Doubles\n"
	
																		+ "5) Exit Application\n",1, 5);
	switch (option) {	
	case 1:
		int int1 = Console.getInt("Enter first integer: ");
		int int2 = Console.getInt("Enter second integer: ");
		System.out.println("Your sum equals "+Calculator.sumNumber(int1, int2));
		Console.askToContinue();
		continue;
	case 2:
		int int3 = Console.getInt("Enter first integer: ");
		int int4 = Console.getInt("Enter second integer: ");
		int int5 = Console.getInt("Enter third integer: ");
		System.out.println("Your sum equals "+Calculator.sumNumber(int3, int4, int5));
		Console.askToContinue();
		continue;
	case 3:
		double dbl1 = Console.getDouble("Enter first double: ");
		double dbl2 = Console.getDouble("Enter second double: ");
		System.out.println("Your sum equals "+Calculator.sumNumber(dbl1, dbl2));
		Console.askToContinue();
		continue;
	case 4:
		double dbl3 = Console.getDouble("Enter first double: ");
		double dbl4 = Console.getDouble("Enter second double: ");
		double dbl5 = Console.getDouble("Enter third double: ");
		System.out.println("Your sum equals "+Calculator.sumNumber(dbl3, dbl4, dbl5));
		Console.askToContinue();
		continue;
	case 5:
		choice = false;
		break;
		}
	}

	System.out.println("Goodbye. :)");
	
	}
	
}
