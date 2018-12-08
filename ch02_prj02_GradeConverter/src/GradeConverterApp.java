
public class GradeConverterApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Letter Grade Converter\n");
		
		boolean cont = false;
		while(cont != true) {
		// prompt user input numerical grade
		int grade = Console.getInt("Enter numerical grade: ", 0, 100);
		
		// business logic
		if (grade >= 88 && grade <= 100) {
			System.out.println("Letter grade: A");
		} else if (grade >= 80 && grade <= 87) {
			System.out.println("Letter grade: B");
		} else if (grade >= 67 && grade <= 79) { 
			System.out.println("Letter grade: C");
		} else if (grade >= 60 && grade <= 66) {
			System.out.println("Letter grade: D");
		} else {
			System.out.println("Letter grade: F");
		}
		
		
		// ask to continue
		Console.askToContinue();
		cont = true;
		}

	}

}