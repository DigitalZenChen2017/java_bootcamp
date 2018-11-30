import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		// declare Scanner object and choice variable
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
		// prompt user input
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		sc.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		sc.nextLine();
		
		System.out.print("Enter email: ");
		String email = sc.next();
		sc.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = sc.next();
		sc.nextLine();
		
		// get the Contact object
        Contact contact = new Contact();
        
        // set contact variables
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setEmail(email);
        contact.setPhone(phone);
		
		// display output
        
        contact.displayContact();
        
//		System.out.println();
//		System.out.println("---------------------------------------------");
//		System.out.println("----Current Contact-----------------------------------------");
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+"\t"+contact.getFirstName()+" "+contact.getLastName());
//		System.out.println("Email Address: "+"\t"+contact.getEmail());
//		System.out.println("Phone Number: "+"\t"+contact.getPhone());
		
		// ask user to continue
		System.out.print("Continue? (y/n): ");
		choice = sc.nextLine();
        System.out.println();
		
		}
		// goodbye message
		System.out.println("Goodbye and good night! :)");
	}

}
