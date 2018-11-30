import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println(); // blank space
		
		// initialize Scanner object and choice variable
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); // create Scanner object
		String choice = "y";
		String letterGrade = "";
	
		// prompt user input
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			int grade = sc.nextInt();
			
		// Business Logic - If/Else Statement
		if (grade >= 88 && grade <= 100) {
			letterGrade = "A";
		}
		else if (grade >= 80 && grade <= 87) {
			letterGrade = "B";
		}
		else if (grade >= 67 && grade <= 79) {
			letterGrade = "C";
		}
		else if (grade >= 60 && grade <= 67) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		// display User output
		System.out.println();
		System.out.println("Letter grade: "+letterGrade);
		
		// ask user to continue
		System.out.println();
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
	}
		// goodbye message
		System.out.println("Goodbye. :)");
		
		
	}

}
