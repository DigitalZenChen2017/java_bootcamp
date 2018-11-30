import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Tip Calculator");
		System.out.println(); //blank line
		
		// declare scanner object and choice variable
		@SuppressWarnings("resource")
	    Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		// format and display the results
        NumberFormat percent = NumberFormat.getPercentInstance();
		
		while(choice.equalsIgnoreCase("y")) {
		// prompt user input
		System.out.print("Cost of meal: ");
		double meal = sc.nextDouble();
		System.out.println();
		
		// for loop - Biz Logic
		double percentage = 15;
		for(percentage = 15; percentage <= 25; percentage +=5) {
			// convert to percentage
			double tipPercentage = percentage/100;
			
		// declare tip and total amount
			BigDecimal tipAmt =  new BigDecimal(meal * tipPercentage)
					.setScale(2, RoundingMode.HALF_UP);
			
			double totalAmt = (meal + (meal * tipPercentage));

			// display output
			System.out.print((percent.format(tipPercentage)+"\n"+
							  "Tip amount: "+tipAmt+"\n"+
							  "Total amount:"+totalAmt));
			System.out.println();
		}
			
		// ask user to continue
		System.out.println();
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
	}
		// goodbye message
		System.out.println("Goodbye. :)");
	}
	
}
