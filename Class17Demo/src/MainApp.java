
public class MainApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Hello");
		
		Student student1 = new Student(1, "Boris", "Chen");
		Course course1 = new Course(1, "Java Bootcamp");
		Course course2 = null;
		
		System.out.println(student1.print());
		System.out.println("Goodbye.");
		
		System.out.println(course1.print());
		
		
	}

}
