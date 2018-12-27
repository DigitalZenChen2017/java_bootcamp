package ui;

import util.Console;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Student Registration Form\n");
		
//		// declare variables and objects
//		@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);
//		
		// prompt user input for First Name, Last Name, and Year of Birth
//		System.out.print("Enter first name: ");
		String firstName = Console.getString("Enter first name: ");
		
//		System.out.print();
		String lastName = Console.getString("Enter last name: ");
		
//		System.out.print();
		int yearofBirth = Console.getInt("Enter year of birth: ");
		
		// display output
		System.out.println("\n" + "Welcome " + firstName + " " + lastName + "!" + "\n"
		+ "Your registration is complete." + "\n"
		+ "Your temporary password is: " + firstName + "*" + yearofBirth);
	}

}
