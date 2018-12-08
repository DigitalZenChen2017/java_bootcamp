/* "Public" - available to all classes and packages
 * "Static" - only a class can call this function/method to execute!
 */
public class HelloWorld1 {
	// class variable - usually lowercaseUppercase (camelCase), but can also be TitleCase, have underscores variable_Name; variable_Name2;
	static String randomString = "String to print"; // static String variable
	
	static final double PINUM = 3.14529; // static Constant (ALL CAPS required)
	
	public static void main(String[] args) 
	{ 
		System.out.println(randomString);
		
		System.out.println(PINUM);
		
		int integer1; // declaration statement
		integer1 = 1; // assignment statement
		int integer2, integer3, integer4, integer5; // declare multiple variable in one line
		
		integer2 = 
		integer1 
		+ 1; // expression statement 2 values > integer1 = 1 and integer2 = 2.
		
		System.out.println("Integer 1: " + integer1 + "\n"
						 + "Integer 2: " + integer2);
		
		byte bigByte = 127;
		short bigShort = 32;
		
		
		
		
	}
	
	
	
	
	
}
