import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
	// welcome message
	System.out.print("Welcome to the Change Calculator");
	System.out.println(); // print blank line
	
	// declare scanner object and choice string variable
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String choice = "y";
	int quarter = 25;
	int dime = 10;
	int nickel = 5;
	int penny = 1;

	
	while (choice.equalsIgnoreCase("y")) {
	// prompt user input
	System.out.print("Enter number of cents (0-99 ): ");
	int totalCents = sc.nextInt();
	
	// convert total cents into quarters, dimes, nickels, and pennies
	
	int totalQuarter = totalCents/quarter;
	totalCents %= quarter;
	
	int totalDime = totalCents/dime;
	totalCents %= dime;
	
	int totalNickel = totalCents/nickel;
	totalCents %= nickel;
	
	int totalPenny = totalCents/penny;
	totalCents %= penny;	
	
	// Display user output
		
	System.out.println();
	System.out.println("Quarters:  "+totalQuarter+"\n"+
					   "Dimes:  "+totalDime+"\n"+
					   "Nickels:  "+totalNickel+"\n"+
					   "Pennies:  "+totalPenny);
	
	// ask user to continue
	System.out.println();
	System.out.print("Continue? (y/n):  ");
	choice = sc.next();
	}
	
	System.out.println("Goodbye.");
}
	
}
