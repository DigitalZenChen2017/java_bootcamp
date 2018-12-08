package thenewBoston_java_tutorial;

public class potpie {
	private int month;
	private int day;
	private int year;
	
	// constructor
	public potpie(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
	}
	
//	 Gets a String representation of an object so instead of potpie@120184bc we'll get what is overidden in the toString() method.
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	
	
	
}
