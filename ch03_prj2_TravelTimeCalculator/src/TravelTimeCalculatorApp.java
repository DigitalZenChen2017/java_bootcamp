import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();

		// initialize objects and variables
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			// prompt user input
		System.out.print("Enter miles: ");
		double miles = sc.nextDouble();
		
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextDouble();
		
		// Business Logic - Estimate Hours and Minutes
		int hours = (int)(miles/mph); // explicit casting - convert from double to int (narrowing the conversion)
		int minutes = (int) (miles % mph/mph * 60);
			
		// Display Output 
		
		System.out.println();
		System.out.println("Estimated travel time" + "\n" + "--------------------");	
		System.out.println("Hours:     "+hours+"\n"+
						   "Minutes:   "+minutes);	
		
			
		// Ask user to continue
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		}
		// Goodbye message
		System.out.println("Goodbye.");
	}

}
