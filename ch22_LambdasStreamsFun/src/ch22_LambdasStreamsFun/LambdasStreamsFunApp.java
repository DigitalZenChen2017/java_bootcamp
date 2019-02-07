package ch22_LambdasStreamsFun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasStreamsFunApp {

	public static void main(String[] args) {
		/*
		 * Syntax of Lambda Expression (parameter/argumentList) -> { statements }
		 * 
		 */
		// Anonymous Class
		new Thread(() -> {
			System.out.println("Printing from the Runnable");
			System.out.println("Line 2");
			System.out.format("This is line %d\n", 3);
		}).start();

		Employee john = new Employee("John Doe", 30);
		Employee boris = new Employee("Boris Chen", 28);
		Employee nick = new Employee("Nick Law", 34);
		Employee gary = new Employee("Gary Henderson", 28);

		List<Employee> employees = new ArrayList<>();
		employees.add(john);
		employees.add(boris);
		employees.add(nick);
		employees.add(gary);
		
		Collections.sort(employees, new Comparator<Employee> () {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
	}


	class Employee {
		private String name;
		private int age;

		public Employee(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

}
