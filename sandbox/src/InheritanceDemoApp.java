
public class InheritanceDemoApp {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		ParentClass pc = new ParentClass("Parent"); // create a new instance of an object
		
		System.out.println("pc = "+pc);
		
		Child c = new Child("Child");
		
		System.out.println("cc = "+c);
		
		
		
		
		System.out.println("Goodbye");

	}

}
