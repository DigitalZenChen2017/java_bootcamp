package ui;

import java.util.Scanner;

public class DiceRollerApp {
	
private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// welcome message
		System.out.println("Dice Roller"+"\n");
		
		// declare variables and objects
		String choice = "y";
		int die1;
		int die2;
		
		// prompt user to roll dice
		choice = getString("Roll the dice? (y/n): ");
		
		// while loop
		while(choice.equalsIgnoreCase("y")) { 
			
		// business logic
		die1 = rollDice(); // explicit casting > double to int - more to less precise
		die2 = rollDice();
		int diesum = die1+die2;
		
		// display output
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Total: " + diesum);
		
		// special messages
		if (diesum == 2) {
		System.out.println("Snake Eyes!");
		}
		else if (diesum == 12) {
		System.out.println("Boxcars!");
		}

		// ask to roll again
		choice = getString("Roll again? (y/n): ");
		
		}
		
		// goodbye message
		System.out.println("Goodbye! :)");
		
	}
	
	// obtain a random number between 1-6
	public static int rollDice() {
		return (int) (Math.random() * 6) + 1; // explicit casting
	}
	

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
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

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
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

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
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

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
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

}
