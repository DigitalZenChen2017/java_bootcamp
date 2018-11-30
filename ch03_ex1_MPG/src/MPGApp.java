import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
                    
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
//            // Math Class - Rounding MPG and doing explicit cast to int data type
//            double mpg = (miles/gallons);
//            int mpgInt = (int) Math.round(mpg * 100) / 100;
//            System.out.println("Miles per gallon is " + mpgInt + ".");
//            System.out.println(); 
            
            // NumberFormat Class - default 3 decimal places
            
//            double mpg = miles/gallons;
//            NumberFormat numberFormat = NumberFormat.getNumberInstance();
//            System.out.println("Miles per gallon is " + numberFormat.format(mpg) + ".");
//            System.out.println();
            
//            // NumberFormat Class - 2 decimal places
//            
//              double mpg = miles/gallons;
//	          NumberFormat numberFormat = NumberFormat.getNumberInstance();
//	          numberFormat.setMaximumFractionDigits(2);
//	          System.out.println("Miles per gallon is " + numberFormat.format(mpg) + ".");
//	          System.out.println();
            
//            // BigDecimal Class
            
            	double mpg = new BigDecimal(miles/gallons)
            			.setScale(2, RoundingMode.HALF_UP).doubleValue();
            	
  	            System.out.println("Miles per gallon is " + mpg + ".");
  	            System.out.println();
            	
            // Continue Message
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
            
            
        }
    }
    
}
