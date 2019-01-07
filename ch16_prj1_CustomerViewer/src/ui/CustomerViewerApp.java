package ui;

import business.Customer;
import db.CustomerDB;
import util.Console;
import util.NoSuchCustomerException;

public class CustomerViewerApp {

	public static void main(String[] args) throws NoSuchCustomerException {
		// welcome message
		System.out.println("Welcome to the Customer Viewer App!");

		// create instance of objects and variables
		String cont = "y";
		Console c = new Console();
		Customer cust = new Customer();

		while (cont.equalsIgnoreCase("y")) {
			// prompt user input
			int customerNumber = c.getInt("\nEnter a customer number: ");

			// call customer by id - business logic
			cust = CustomerDB.getCustomer(customerNumber); // sets cust object instance variables equal to customer
															// number
			System.out.println(" ");

			// display output
			try {
				System.out.println(cust.getNameAndAddress());
			} catch (NullPointerException n) {
				NoSuchCustomerException nsce = new NoSuchCustomerException(
						"No customer found for number " + customerNumber + ".");
			}

			// ask to continue
			cont = c.getString("\nDisplay another customer? (y/n): ");
		}

		// goodbye message
		System.out.println("Bye!");
	}

}
