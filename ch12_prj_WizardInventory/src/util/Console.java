package util;
import java.util.Scanner;

public class Console {
	
	protected Scanner sc = new Scanner(System.in); 
	
	public String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); //discard any other data entered on the line
		return s;
	}
	
	public int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			} 
			sc.nextLine(); // discard any other data entered on the line
			isValid = true;
		}			
		return i;
	}
	
	public int getIntWithinRange(String prompt, int min, int max ) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(prompt);
			if (i < min) {
				System.out.println(
						"Error! Number must be greater than " + min + ".");
			} else if (i > max) {
				System.out.println(
						"Error! Number must be less than " + max + ".");
			}  else { 
				  isValid = true;
			  }
			  
			}
			return i;
		}
	
	public double getDouble(String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid double type number. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}
	 
	public double getDoubleWithinRange(String prompt, double min, double max ) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(prompt);
			if (d < min) {
				System.out.println(
						"Error! Double type Number must be greater than " + min + ".");
			} else if (d > max) {
				System.out.println(
						"Error! Double type Number must be less than " + max + ".");
			}  else { 
				  isValid = true;
			  }
			  
			}
			return d;
		}
	
	
	public boolean askToContinue() {
		boolean isValid = false;
		while(!isValid) {
			System.out.print("Continue? (y/n): ");
			String choice = sc.next();
		if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
			System.out.println();
			System.out.println("Invalid input! Please enter either a (y/n).");
			System.out.println();
		} else if (choice.equalsIgnoreCase("y")) { 
			isValid = true;
		} else {
				break;
			}
		} 
		
	return isValid;
	}

}
		

