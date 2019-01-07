package ui;

import java.util.Scanner;

public class DiceRollerApp {

	/*
	 * This version of the DiceRollerApp is done without a Console Class
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Dice Roller Game!");

		// declare variables
		String rollAgain = "y";
		int die1;
		int die2;
		int sum;
		Scanner sc = new Scanner(System.in);

		// prompt user input
//		System.out.print("\nRoll the dice? (y/n): ");
////		rollAgain = sc.next();
//		sc.nextLine(); // discard any other data entered on the line
		rollAgain = getStringChoice(sc, "\nRoll the dice? (y/n): ", "y", "n");

		while (rollAgain.equalsIgnoreCase("y")) {
			// business logic
			die1 = rollDice();
			die2 = rollDice();
			sum = die1 + die2;

			// display output
			System.out.println("\nDie 1: " + die1 + "\n" + "Die 2: " + die2 + "\n" + "Total: " + sum);

			// special cases
			if (sum == 12) {
				System.out.println("Boxcars!");
			} else if (sum == 2) {
				System.out.println("Snake Eyes!");
			}

			// ask user to continue
			System.out.print("\nRoll again? (y/n): ");
			rollAgain = sc.next(); // stores user input
			sc.nextLine(); // discards any data following the space
		}

		// goodbye message
		System.out.println("Goodbye!");

	}

	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
	/* Example of explicit casting --> double to int (most to least precise)
				 							  * returns a random number between 0 and 6

	/*
	 * The getStringChoice method takes 4 arguments (Scanner object, String prompt
	 * message, and 2 choice variables (y/n)
	 * 
	 */
	public static String getStringChoice(Scanner sc, String prompt, String choice1, String choice2) {
		String s; // declare variable that stores user input
		boolean isValid = false; // variable used to valid user input equals one of 2 choices
		do {
			System.out.print(prompt); // prints prompt "Roll dice? (y/n): "
			s = sc.next(); // stores user input as a String and sets equal to String reference type
							// variable s
			sc.nextLine(); // stores blank input - discarding data on the line

			// data validation
			if (s.equalsIgnoreCase(choice1) || s.equalsIgnoreCase(choice2)) {
				isValid = true;
			}
		} while (!isValid);
		return s;
	}
}
