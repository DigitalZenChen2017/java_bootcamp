import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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
		
		students.add(0, "Lisa");
		
		System.out.println(students);
		System.out.println();
		
		students.get(5);
		
		students.indexOf("Nick");
		
		System.out.println("sort it...");
		Collections.sort(students);
		System.out.println(students);
		System.out.println("Bye");
		
		
		// create an ArrayList with Integer data type and add 2 integer elements
		ArrayList<Integer> employees = new ArrayList<>();
		employees.add(1426);
		employees.add(1411);
		
		// Enhanced for loop or foreach loop
		for(int employee : employees) {
			System.out.println(employee);
		}
		
		// 
		ArrayList<String> inventory = new ArrayList<>();
		
		String item = "Computer";
		
		inventory.add(item);
		inventory.add("Printer");
		inventory.add("Monitor");
		inventory.add(1, "Mouse"); // (index number, value)
		
		String s = inventory.get(2);
		
		System.out.println(s);
		
		inventory.set(2, "ChangedPrinter");
		
		System.out.println(inventory);
		System.out.println();
		
		// LinkedList
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(44);
		numbers.add(7);
		numbers.add(35);
		numbers.set(1, 29);
		numbers.removeFirst();
		numbers.peek();
		
		int size = numbers.size();
		System.out.println(size);
		System.out.println(numbers);
		
		// Hashmaps and TreeMap classes
		HashMap<String, Double> sales = new HashMap<>();
		sales.put("January", 389.45);
		sales.put("February", 432.89);
		sales.put("March", 275.30);
		
		for(Map.Entry sale : sales.entrySet()) {
			System.out.println(sale.getKey() + ": " + sale.getValue());
		}
		
	}
}
