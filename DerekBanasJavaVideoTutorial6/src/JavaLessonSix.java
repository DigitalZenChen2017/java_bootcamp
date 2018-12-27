//java.lang.RunTimeException; // runtime exceptions
//
//java.lang.Exception; // complier exceptions
//
//ArithmeticException
//ClassNotFoundException
//IllegalArgumentException
//IndexOutOfBoundsExceptions
//InputMismatchException
//IOException

import java.util.*;
import java.io.*;

public class JavaLessonSix {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		try {
		getAFile("./somestuff.txt");
		}
		catch (IOException e) {
			System.out.println("An IO Error Occurred.");
		}
	
		
		
//		System.out.print("How old are you? ");
//		int age = checkValidAge();
//		
//		if (age != 0) {
//			System.out.println("You are " + age + " years old!");
//		}
	}
	
	public static void getAFile(String fileName) throws IOException, FileNotFoundException { // throws the following exceptions back to the main method
		
		FileInputStream file = new FileInputStream(fileName);
	}
	
//	public static void getAFile(String fileName) {  
//		try {FileInputStream file = new FileInputStream(fileName); // open up new FileInputStream with new instantiation of object "file"
//			
//		}
//		
//		// Start with most specific exception FIRST and least specific LAST
//		catch(FileNotFoundException e) 
//		{
//			System.out.println("Sorry can't find that file.");
//		}
//		
//		catch (IOException e) 
//		{
//			System.out.println("Unknown IO Error");
//		}
//		
//		catch(ClassNotFoundException e) {}
//		
//		catch(Exception e) // Catches all general exceptions other than above TWO
//		{
//			System.out.println("Some error occurred");
//		}
//		
//		finally { // finally is ALWAYS called regardless of Exception or not
//			System.out.println("");
//		}
//	}
	
	public static int checkValidAge() {
		
		try {
			
			return userInput.nextInt();
		}
		
		catch (InputMismatchException e) {
			userInput.next();
			System.out.println("That isn't a whole number.");
			return 0;
		}
	}
	
//	public static void divideByZero(int a) {
//		try {
//			System.out.println(a/0); // ArithmeticException / by zero
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Cannot Divide By Zero!");
//			
//			System.out.println(e.getMessage());
//			
//			e.printStackTrace(); // prints out exact line by line error message
//			
//			System.out.println(e.toString());
//			
//			
//		}
//		
//	}

}
