import java.util.Scanner;

public class MyConsole extends Console {
	Scanner sc = new Scanner(System.in); 
	
//	@SuppressWarnings("unlikely-arg-type")
//	public String getString(String prompt) {
//		String s = "";
//		boolean isValid = false;
//		while (!isValid) {
//			System.out.print(prompt);
//			s = sc.nextLine();
//			if (sc.equals("")) {
//			System.out.println("Error! Cannot enter empty string!");
//		}
//		else {
//			isValid = true;
//		} 
//
//	}
//		return s;
//}

	public String getString(String prompt) {
		boolean isValid = false;
		String s = "";
		while (!isValid) {
			System.out.print(prompt);
			s = sc.next(); // read user entry
			sc.nextLine(); //discard any other data entered on the line
			if (sc.equals("")) {
				System.out.println("Cannot enter empty string! Please input valid String.");
			}
		}
		return s;
	}
	
}
