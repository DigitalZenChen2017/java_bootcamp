package ch22_ContactManager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ContactManagerConsumerInterfaceApp {

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

		System.out.println("Print name of all contacts:");
		processContacts(contacts, (Contact c) -> System.out.println(c.getName()));
		System.out.println("Contacts without phone...");
		processContacts(contacts, (Contact c) -> System.out.println(c));
		
		System.out.println("Change the names of all contacts to upper case");
		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		processContacts(contacts, c -> System.out.println(c));
		
		
		
//		List<Contact> cne = filterContacts(contacts, c -> c.getEmail() == null);
//		System.out.println("Contacts without email...");
//		printContactSummary(cne);

		// goodbye message
		System.out.println("Bye");
	}

	private static void printContactSummary(List<Contact> contacts) {
		System.out.println("Contact Summary:");
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}
	
	// accept method performs a specific operation without returning a value
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c : contacts) {
			consumer.accept(c);
		}
	}

}
