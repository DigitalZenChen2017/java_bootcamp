import java.util.Scanner;

public class JavaCode {
	
	static double randomNumber;
	
	static Scanner userInput = new Scanner(System.in);
	
//	static double myPI = 3.14159; // Class Variable - can be used ANYWHERE
	
	public static void main(String[] args) {
		
		int d = 5;
		tryToChange(d); // this passes the VALUE of d NOT the VARIABLE
		
		System.out.println("main d = " + d);
		
		
		
		
		
		
		
		
	}
	
	public static void tryToChange (int d) {
		d = d + 1;
		System.out.println("trytoChange d = "+ d);
		
		
	}
		
		
//		accessModifier static returnType methodName (
		
		
//		
//		System.out.println(addThem(1, 2));
//		
//		System.out.println("Global " + myPI);
	}
	
	
	
//	public static int addThem(int a, int b) {
//		
//		double smallPI = 3.140; // Local Variable - only accessible inside this method
//		
//		myPI = myPI + 3.0; // local variable to show class/global variable remain same while local is 3.0
//		
//		int c = a + b;
//		
//		return c;
//	}


