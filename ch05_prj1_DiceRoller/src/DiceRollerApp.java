import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Dice Roller");
		
		// initialize scanner object and choice variable
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		int die1;
		int die2;
		int dietotal;
		choice = getStringchoice(sc, "Roll the dice? (y/n): ", "y", "n");
		
		while (choice.equalsIgnoreCase("y")) {
		
		die1 = rollDice();	
		die2 = rollDice();
		dietotal = die1+die2;
		
		System.out.println("Die 1: "+die1);
		System.out.println("Die 2: "+die2);
		
		if (dietotal == 2) {
			System.out.println("Snake eyes");
		} else if (dietotal == 12) {
			System.out.println("Boxcars");
		}
		
		// Prompt User Input
			
		choice = getStringchoice(sc, "Roll again? (y/n): ", "y", "n");
			
			
		// Closing Message
		
			
		}
		System.out.println("Bye!");
	}
	
	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
	
	public static String getStringchoice(Scanner sc, String prompt, String choice1, String choice2) {
		String s = "";
		boolean isValid = false;
		do {
			System.out.print(prompt);
			s = sc.next();
			sc.nextLine();
			
			if (s.equalsIgnoreCase(choice1)|| s.equalsIgnoreCase(choice2)) {
				isValid = true;
			}
		} while(!isValid);
		return s;
	}
	
	
}
