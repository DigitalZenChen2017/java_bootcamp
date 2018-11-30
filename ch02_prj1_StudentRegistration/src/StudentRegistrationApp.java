import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Student Registration Form");
		System.out.println();
		
		// declare Scanner object
		@SuppressWarnings("resource")
	    Scanner sc = new Scanner(System.in);
		
		// prompt user input
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		
		System.out.print("Enter year of birth: ");
		int birthYear = sc.nextInt();
		
		// display output
		
		System.out.println();
		System.out.println("Welcome "+firstName+" "+lastName+"!"+"\n"+
						   "Your registration is complete."+"\n"+
						   "Your temporary password is: "+firstName+"*"+birthYear);
		
	}

}
