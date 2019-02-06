package ch22_ContactManager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ContactManagerPredicateInterfaceApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Hello");

		// Create List of Contacts
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts:");
		printContactSummary(contacts);

		List<Contact> cnp = filterContacts(contacts, (Contact c) -> c.getPhone() == null); 
		System.out.println("Contacts without phone...");
		printContactSummary(cnp);

		List<Contact> cne = filterContacts(contacts, c -> c.getEmail() == null);
		System.out.println("Contacts without email...");
		printContactSummary(cne);

		// goodbye message
		System.out.println("Bye");
	}

	private static void printContactSummary(List<Contact> contacts) {
		System.out.println("Contact Summary:");
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}

	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
