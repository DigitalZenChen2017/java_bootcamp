package thenewBoston_java_tutorial;

public class apples {
	public static void main(String[] args) {
		// create new instance of potpie class 
		potpie potObject = new potpie(4, 5, 6);
		tuna tunaObject = new tuna("Boris", potObject);
		
		System.out.println(tunaObject);
		
		System.out.println();
//		// escape sequence tests
//		System.out.println("Line 1." + "\r" + "\"Line 2.\"" + "\n" + "\\\\ This is a single-line comment printed to the console.");
//		
//		
		
	}
}
