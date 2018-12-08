package ui;

import business.Calculator;
import util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Console console = new Console();
		int n1 = console.getInt("Enter 1st number: ");
		
		int n2 = console.getInt("Enter 2nd number: ");
		
		System.out.println("Sum = " + Calculator.sumNumber(n1, n2));
		
		
		System.out.println("Bye");

	}

}
