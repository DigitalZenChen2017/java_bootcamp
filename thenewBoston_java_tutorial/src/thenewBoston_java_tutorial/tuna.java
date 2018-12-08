package thenewBoston_java_tutorial;

public class tuna {
	private String name;
	private potpie birthday;
	
	public tuna(String theName, potpie theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
	
}
