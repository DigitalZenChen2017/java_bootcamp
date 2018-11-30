import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InterestCalculatorApp {

	public static void main(String[] args) {
	// welcome message
	System.out.print("Welcome to the Interest Calculator");
	System.out.println();
	
	// declare scanner object and choice variable
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	// set currency and percentage formats
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	NumberFormat percent = NumberFormat.getPercentInstance();
	
	// allow currency up to 2 digits and percent up to 3 digits
	currency.setMaximumFractionDigits(2);
	percent.setMaximumFractionDigits(3);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
	// prompt user input
	System.out.print("Enter loan amount:  ");
	double loanAmt = sc.nextDouble();
	
	System.out.print("Enter interest rate: ");
	double interestRate = sc.nextDouble();
	
	// Business Logic
	double interest = new BigDecimal(loanAmt * interestRate)
			.setScale(2, RoundingMode.HALF_UP)
			.doubleValue();
	
	// Display user output
	System.out.println();
	System.out.println("Loan amount:  "+currency.format(loanAmt)+"\n"+
					   "Interest rate:  "+percent.format(interestRate)+"\n"+
					   "Interest:  "+currency.format(interest));
	
	
	
	// ask user to continue
	System.out.println("Continue? (y/n): ");	
	choice = sc.next();
	}
	// goodbye message
	System.out.println("Goodbye.");
	
	}

}
