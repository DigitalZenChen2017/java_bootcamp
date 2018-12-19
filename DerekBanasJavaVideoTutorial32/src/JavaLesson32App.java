import java.io.*;

public class JavaLesson32App {

	public static void main(String[] args) {
		
		// Create an array of type Customer
		
		Customer[] customers = getCustomers();
		
		// PrintWriter is used to write characters to a file in this situation
		
		PrintWriter custOutput = createFile("/Desktop/MaxTech/workspaces/java_bootcamp/customers.txt");
		
		// Enhanced for loop for arrays
		// Cycles through all of the people in the customers array

		for(Customer person : customers) {
			
			createCustomers(person, custOutput);
		}
		
		// Closes the connection to the PrintWriter
		
		custOutput.close();
		
	} // END of main FUNCTION
	
	private static class Customer{
		
		public String firstName, lastName;
		public int custAge;
		
		public Customer(String firstName, String lastName, int custAge) {
			this.firstName = firstName; // this refers to current object you're working with
			this.lastName = lastName;
			this.custAge = custAge;
			
			
		}
	}
	
	private static Customer[] getCustomers() {
		
		Customer[] customers = new Customer[5]; // creates an Array object customers with 5 Customer objects
		
		customers[0] = new Customer("John", "Smith", 21);
		customers[1] = new Customer("Sally", "Smith", 21);
		customers[2] = new Customer("Boris", "Smith", 21);
		customers[3] = new Customer("Chris", "Smith", 21);
		customers[4] = new Customer("Paul", "Smith", 21);
		
		return customers;
	}
	
	private static PrintWriter createFile(String fileName) {
		
		try {
			File listOfNames = new File(fileName);
			
			PrintWriter infoToWrite = new PrintWriter(
										new BufferedWriter(
												new FileWriter(listOfNames)));
		}
		
		catch(IOException e) {
			
		System.out.println("An I/O Error Occurred");
		System.exit(0);
		
		}
		return null;
	}
	
	private static void createCustomers(Customer customer, PrintWriter custOutput) {
		
		String custInfo = customer.firstName + " " + customer.lastName;
		
		custInfo += Integer.toString(customer.custAge);
		
		custOutput.println(custInfo);
		
		
	}
	
	private static void getFileInfo() {
		
		System.out.println("Info Written to File\n");
		
		File listOfNames = new File("/Desktop/MaxTech/workspaces/java_bootcamp/customers.txt");
		
		try {
			
			BufferedReader getInfo = new BufferedReader(
					new FileReader(listOfNames));
			
			String custInfo = getInfo.readLine();
			
			while(custInfo != null) {
				
				System.out.println(custInfo);
				custInfo = getInfo.readLine();
				
			}
			
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Couldn't Find File");
			System.exit(0);
		}
		
		catch (IOException e) {
		System.out.println("An I/O Error Occurred.");
		System.exit(0);
		}

	} // END OF JavaLesson32 CLASS

}
