import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		/*
		 * Pseudo-Code: 5 Steps 1. Welcome Message 2. Prompt User Input 3. Business
		 * Logic 4. Display Output 5. Closing Message
		 */
		
		int a = 0;
		int b = 0;

		// welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println(); // print a blank line

		// create a Scanner object named sc
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// perform invoice calculations until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the invoice subtotal from the user
			System.out.print("Enter subtotal:   ");
			double subtotal = sc.nextDouble();

			// calculate the discount amount and total
			double discountPercent;
			if (subtotal >= 200) {
				discountPercent = .2;
			} else if (subtotal >= 100) {
				discountPercent = .1;
			} else {
				discountPercent = 0.0;
			}
			double discountAmount = subtotal * discountPercent;
			double total = subtotal - discountAmount;

			// display the discount amount and total
			String message = "Discount percent: " + discountPercent + "\n" + "Discount amount:  " + discountAmount
					+ "\n" + "Invoice total:    " + total + "\n";
			System.out.println(message);

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}