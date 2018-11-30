import java.util.Scanner;
import java.text.NumberFormat;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// welcome message
	System.out.println("Welcome to the Temperature Converter");
	System.out.println();
	
	@SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	while(choice.equalsIgnoreCase("y")) {
		// prompt user input degrees in Fahrenheit as double
		System.out.print("Enter degrees in Fahrenheit: ");
		double fahrenheit = sc.nextDouble();

		// Business Logic
		double celsius = (fahrenheit - 32) * 5/9;
		
		// Create NumberFormat object
		NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);	
        
        // Display Output
        System.out.println("Degrees in Celsius: "+number.format(celsius));
        System.out.println("");
			
		// Ask user to continue
        System.out.println("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
	}

		// closing message
	System.out.println("Goodbye");
}
	}
	   
