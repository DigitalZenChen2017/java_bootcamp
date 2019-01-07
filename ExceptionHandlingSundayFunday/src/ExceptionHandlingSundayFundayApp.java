/** This App is primarily used to test Questions #9, #10, and #11 on Chapter 16 Quiz
 * 
 */

/**
 * @author ZenMasterChen
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingSundayFundayApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// define Scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number less than 10: ");
		boolean tryAgain = true;

		while (tryAgain) {
			try {
				int num = scanner.nextInt();
				if (num >= 10) {
					throw new InputMismatchException();
				}
				tryAgain = false;
			}
			catch(InputMismatchException ime) {
				System.out.print("Enter a valid integer less than 10: ");
			}
		}
	}

}
