import java.util.Scanner;
import java.util.*;


/*
 * this is a multiple line comment
 */

// single line comment
/* static means 
 *  
 */

public class Animal {
	
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
// protected means its only accessible inside your package	
// great rule of thumb - use static for objects that we want to share methods with other classes
	protected static int numberOfAnimals = 0;
	
	static Scanner sc = new Scanner(System.in); // create a Scanner object

	// constructor w/o any fields
	public Animal() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = "+ sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 + 1 = "+ diffOfNumbers);
		
		int multOfNumbers = 5 + 1;
		System.out.println("5 + 1 = "+ multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 + 1 = "+ divOfNumbers);
		
		int modOfNumbers = 5 % 1;
		System.out.println("5 + 1 = "+ modOfNumbers);
		
	}
	
	public static void main(String[] args) { 
		
		Animal theAnimal = new Animal();
		
		
		
		
		
		
		
		
		
//		super(); // calls superclass, we have to put "extend" to other classes to make them subclasses
	}

	
	
}