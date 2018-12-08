import java.util.Scanner;


public class StudentRegistrationApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Student Registration Form");
		System.out.println();
		
		
		/* 2 ways of prompting USER INPUT
		 * 1. Use the Console class to call the methods getString and getInt to store
		 * the values: firstName, lastName, and yearOfBirth.
		 * 2. Import java.util.Scanner class in the StudentRegistrationApp, create a Scanner object,
		 * and prompt the 3 variables individually with objectName.next, .nextInt, .nextDouble, .nextLine. 
		 */
		
		// prompt user input - first name, last name, and birthday.
//		String firstName = Console.getString("Enter first name: ");
//		String lastName =  Console.getString("Enter last name: ");
//		int yearOfBirth = Console.getInt("Enter year of birth: ");
		
		// create a new Scanner object - instance of a Scanner class
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = scan.next();
		
		System.out.print("Enter last name: ");
		String lastName = scan.next();
		
		System.out.print("Enter year of birth: ");
		int yearOfBirth = scan.nextInt();
		
		// display user output
		System.out.println("\n" + "Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + yearOfBirth);
	}

}
