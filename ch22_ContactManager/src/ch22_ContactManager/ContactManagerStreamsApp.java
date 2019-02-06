package ch22_ContactManager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactManagerStreamsApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Hello");

		// Create List of Contacts
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts:");
//		printContactSummary(contacts);
//
//		System.out.println("Print name of all contacts:");
//		processContacts(contacts, (Contact c) -> System.out.println(c.getName()));
//		System.out.println("Contacts without phone...");
//		processContacts(contacts, (Contact c) -> System.out.println(c));
//
//		System.out.println("Change the names of all contacts to upper case");
//		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
//		processContacts(contacts, c -> System.out.println(c));

		contacts.stream().forEach(c -> System.out.println(c));

		System.out.println("Contacts w/o Phone #:");
		contacts.stream().filter(c -> c.getPhone() == null).forEach(c -> System.out.println(c));

		List<Contact> cnp = contacts.stream().filter(c -> c.getPhone() == null).collect(Collectors.toList());
		System.out.println("There are " + cnp.size() + " contacts with no phone numbers.");
		
		List<String> contactNames = contacts.stream()
				.map(Contact::getName)
				.collect(Collectors.toList());
		
		contactNames.stream().forEach(System.out::println);

		// goodbye message
		System.out.println("Bye");
	}

}
