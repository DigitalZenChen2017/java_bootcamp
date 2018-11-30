package ch07_prj4_DiceRoller;

import java.util.Scanner;

public class DieRollerApp {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to the Dice Roller App!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll the dice? ");
		String choice = sc.next();
		
		while(choice.equalsIgnoreCase("y)) {
			Dice dice = new Dice();
			dice.roll();
			dice.printRoll();
			
				System.out.print("Roll again?  ");
				choice = sc.next();
			
			
			
			
	}
		//
		System.out.println("Bye!");
	}

}
