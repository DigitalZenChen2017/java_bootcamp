import java.util.ArrayList;

public class CollectionsDemoApp {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<String> students = new ArrayList<>();
		students.add("Yelena");
		students.add("Nick");
		students.add("Katrina");
		students.add("Gary");
		students.add("Boris");
		students.add("Eric");
		
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println(students);  
	}
}
