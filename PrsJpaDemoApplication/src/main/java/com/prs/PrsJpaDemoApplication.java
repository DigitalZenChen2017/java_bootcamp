package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.db.UserDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		
		System.out.println("hello");
		Console console = new Console();
		int o = 0;
		
		while (o!=9) {
			displayMenu();
			
			
			o = console.getInt("Enter option:  ");
			
			if (o==1) {
				// get all users
				List<User> users = UserDB.getAll();
				for (User u: users) {
					System.out.println(u);
				}
			}
		}
	}
	
	private static void displayMenu() {
		System.out.println("1 - get all users");
		System.out.println("9 - exit");
	
	}

}

