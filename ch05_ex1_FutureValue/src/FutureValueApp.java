import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Future Value Calculator\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.println("DATA ENTRY");
            double monthlyInvestment = getDoubleWithinRange(sc,
                    "Enter monthly investment: ", 0, 1000);
            double interestRate = getDoubleWithinRange(sc,
                    "Enter yearly interest rate: ", 0, 30);
            int years = getIntWithinRange(sc,
                    "Enter number of years: ", 0, 100);
            System.out.println();

            // calculate the future value
            double monthlyInterestRate = interestRate / 12 / 100;
            int months = years * 12;
            double futureValue = calculateFutureValue(
                    monthlyInvestment, monthlyInterestRate, months);


            // format the result as a single string
            
            printFormattedResults(monthlyInvestment, interestRate, years, futureValue);
            
            // Ask to Continue 
          
            choice = askToContinue(sc, choice);
        }
        System.out.println("Bye!");
        
    }
    
    
    public static double getDoubleWithinRange(Scanner sc, String prompt,
            double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            d = getDouble(sc, prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
    
// Exercise 5-1 Step 1-5
    
   private static void printFormattedResults(double monthlyInvestment, double interestRate, int years, double futureValue) {
    	 // Define 2 NumberFormat objects for currency and percentage
    	 NumberFormat c = NumberFormat.getCurrencyInstance();     	 
    	 NumberFormat p = NumberFormat.getPercentInstance();
    	 p.setMinimumFractionDigits(1);
    	 
    	 System.out.println("Monthly Investment: "+c.format(monthlyInvestment)+"\n"
    	 		 +"Interest Rate: "+p.format(interestRate/100)+"\n"
    	 		 +"Future Value: "+c.format(futureValue)+"\n");
    }  
    	

// Step 6 of Exercise 5-1
    
    public static String askToContinue(Scanner sc, String choice) {
    System.out.print("Continue? (y/n): ");
    choice = sc.next();
    return choice;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static double calculateFutureValue(double monthlyInvestment,
            double monthlyInterestRate, int months) {
        double futureValue = 0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment) * 
                          (1 + monthlyInterestRate);
        }
        return futureValue;
    }
}