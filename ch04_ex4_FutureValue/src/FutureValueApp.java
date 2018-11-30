import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
    		// Welcome message
        System.out.println("The Future Value Calculator\n");
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();
//            System.out.print("Enter yearly interest rate: ");
//            double interestRate = sc.nextDouble();
            System.out.print("Enter number of years:      ");
            int years = sc.nextInt();
            
            // Get percent and currency formatters 
            NumberFormat percent = NumberFormat.getPercentInstance();
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            percent.setMinimumFractionDigits(1);
            
            // initialize string table
            String table = "";
            
            // create the header row and add it to the table and For loop to increment interestRate
            String headerRow = "Year\t";
            for (double interestRate = 5; interestRate <= 6.5; interestRate += 0.5) {
            	headerRow += percent.format(interestRate/100) + "\t\t";
            }
            table += headerRow + "\n";
            
            // For loop to increment Year
            for (int year = 1; year < 7; year++) {
            	// add year to the start of the row
            	String row = year + "\t";
            	
            	// loop through each interest rate
            	for (double interestRate = 5.0; interestRate < 7.0; interestRate += .5) {
            		int months = years * 12;
            		double monthlyInterestRate = interestRate / 12 / 100;
            		
            		// Calculate the future value
            		double futureValue = 0.0;
            		for (int i = 1; i <= months; i++) {
            			futureValue = (futureValue + monthlyInvestment) * 
                            (1 + monthlyInterestRate);
            	}
            		// add calculation to the row
            row += currency.format(futureValue) + "\t";
            		
            }
            		// add the row to the table
            table += row + "\n";
            
            }
            System.out.println(table);
            
            
//            // convert yearly values to monthly values
//            double monthlyInterestRate = interestRate / 12 / 100;
//            int months = years * 12;
//
//            // use a for loop to calculate the future value
//            double futureValue = 0.0;
//            for (int i = 1; i <= months; i++) {
//                futureValue = (futureValue + monthlyInvestment) * 
//                              (1 + monthlyInterestRate);
//            }
//
//            // format the result and display it to the user
//            NumberFormat currency = NumberFormat.getCurrencyInstance();
//            System.out.println("Future value:               "
//                    + currency.format(futureValue));
//            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}