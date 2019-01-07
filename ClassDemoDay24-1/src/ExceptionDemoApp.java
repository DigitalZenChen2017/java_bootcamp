import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		methodA();

		System.out.println("Goodbye");

	}

	private static void methodA() {
		System.out.println("method A");
		methodB();
	}

	private static void methodB() {
		System.out.println("method B");
		try {
			methodC();
		} catch (InputMismatchException ime) {
			System.out.println("Exception occurred.");
		}
	}

	private static void methodC() throws InputMismatchException {
		System.out.println("method C");
		Scanner sc = new Scanner(System.in);

		// option 1: wrap in a try/catch
		while (true) {
			try {
				System.out.println("Enter an integer: ");
				int a = sc.nextInt();
				System.out.println("You entered " + " " + a);
				break;
			} catch (InputMismatchException ime) /* type and variable name */ {
				System.out.println("Not a valid int, try again.");
//				System.err.println(ime.toString());
				System.out.println(ime);
				sc.nextLine();
			}

		}	  
//		// option 2: throw the exception
//		System.out.println("Enter an integer: ");
//		int a = sc.nextInt();
//		System.out.println("You entered " + " " + a);
//		
//		sc.close();

		// Most common -> NullPointerException

	}
}
