package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.business.UserDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);

		Console c = new Console();

		System.out.println("Hello Spring Boot World.");
		int o = 0;
		while (o != 9) {
			o = c.getIntWithinRange("Enter Option: ", 0, 10);
			if (o == 1) {
				// get all users
				List<User> users = UserDB.getAll();
				for (User u : users) {
					System.out.println(u);
				}
			}
			if (o ==2) {
				// get/inspect user
				int id = c.getInt("Enter ID: ");
				User u = new User();
				u = UserDB.getUserById(id);
				System.out.println(u);
			
			}
		}
	}

	private static void displayMenu() {
		System.out.println("Options");
		System.out.println("1 - List All Users");
		System.out.println("2 - Get/Inspect User");
	}

}
