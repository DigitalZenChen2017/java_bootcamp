import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // Create currency object from NumberFormat class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // declare monthNames and monthSales arrays
        String[] monthNames = new String[12]; // number refers to the quantity not position
        
        // set position equal to value
        monthNames[0]= "January";
        monthNames[1]= "Feburary";
        monthNames[2]= "March";
        monthNames[3]= "April";
        monthNames[4]= "May";
        monthNames[5]= "June";
        monthNames[6]= "July";
        monthNames[7]= "August";
        monthNames[8]= "September";
        monthNames[9]= "October";
        monthNames[10]= "November";
        monthNames[11]= "December";
        
        double[] monthSales = new double[12];
        
        monthSales[0] = 2400.50;
        monthSales[1] = 2150.78;
        monthSales[2] = 3468.04;
        monthSales[3] = 2104.49;
        monthSales[4] = 5500.00;
        monthSales[5] = 6300.50;
        monthSales[6] = 9800.25;
        monthSales[7] = 4100.50;
        monthSales[8] = 3150.50;
        monthSales[9] = 2250.50;
        monthSales[10] = 1275.50;
        monthSales[11] = 3000.50;
        
        // declare choice variable
        String choice = "n";
        
        while(choice.equalsIgnoreCase("y")) {
        	// prompt user input for Month Name
        int monthNumber = Console.getInt("Enter month number: ");
        
        // validate input
        if (monthNumber < 1 || monthNumber > monthNames.length) /* quantity "12" at top) */ { 
        	Console.displayLine("Invalid input! Please enter a number between 0 and " + monthNames.length);
        } else
        	Console.displayLine("Sales for " + monthNames[monthNumber] + ": " + currency.format(monthSales[monthNumber]));    
        }
               
//        double sum = 0;
//        // use for loop to sum the values 
//        for(int i = 0; i < monthSales.length; i++) {
////        	System.out.println(currency.format(monthSales[i]));
//        	sum += monthSales[i];
//		}
//        
//        System.out.println("Total Yearly Sales: " + currency.format(sum));
        
        int sum = 0;
        // enhanced for loop
        for(double monthSale : monthSales) {
        	sum += monthSale;
        }
        
        Console.displayLine("Total Yearly Sales: " + currency.format(sum));
        
        // check if the user wants to continue
        choice = Console.getString("Continue? (y/n): ");
        Console.displayLine();
}
    
}
